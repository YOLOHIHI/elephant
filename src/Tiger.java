class Tiger extends Animal {
    public Tiger(String name, int weight, int id) {
        super(name, weight, id, 1);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 老虎：嗷嗷一声");
    }
}
