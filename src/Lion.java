class Lion extends Animal {
    public Lion(String name, int weight, int id) {
        super(name, weight, id, 1);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 狮子：怒吼一声");
    }
}
