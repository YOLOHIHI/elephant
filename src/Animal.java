abstract class Animal {
    protected String name;
    protected int weight;
    protected int id;
    protected int aggressiveness; // 攻击力，0 表示无攻击性，1 表示有攻击性

    public Animal(String name, int weight, int id, int aggressiveness) {
        this.name = name;
        this.weight = weight;
        this.id = id;
        this.aggressiveness = aggressiveness;
    }

    public abstract void makeSound();

    public void enterElectric(Electric electric) {
        electric.enter(this);
    }

    public boolean isStrongerThan(Animal other) {
        if (this.aggressiveness > other.aggressiveness && this.weight >= other.weight / 2) {
            return true;
        } else if (this.aggressiveness == other.aggressiveness && this.weight > other.weight) {
            return true;
        }
        return false;
    }

    public int getBattlePower() {
        return aggressiveness * weight;
    }
}
