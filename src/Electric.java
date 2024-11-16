import java.util.ArrayList;
import java.util.Comparator;

abstract class Electric {
    protected String name;
    protected int capacity;
    protected ArrayList<Animal> animals;

    public Electric(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public void enter(Animal animal) {
        System.out.println(animal.name + " 进入 " + this.name);
        if (animals.size() < capacity) {
            animals.add(animal);
            animal.makeSound();
            checkAndAttack(animal);
        } else {
            System.out.println(this.name + " 容量已满！");
        }
    }

    private void checkAndAttack(Animal newAnimal) {
        for (int i = 0; i < animals.size() - 1; i++) {
            Animal oldAnimal = animals.get(i);
            if (newAnimal.isStrongerThan(oldAnimal)) {
                System.out.println(newAnimal.name + " 杀死了 " + oldAnimal.name);
                animals.remove(oldAnimal);
                i--; // 防止移除后跳过下一个元素
            }
        }
    }

    public void sortShow() {
        animals.sort(Comparator.comparing(Animal::getBattlePower).reversed());
        System.out.println(this.name + " 中按战斗力排序的动物：");
        for (Animal animal : animals) {
            System.out.println(animal.name + " - 体重: " + animal.weight + ", 攻击力: " + animal.aggressiveness);
        }
    }
}
