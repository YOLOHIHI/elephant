class Elephant extends Animal {
    private int height; // 添加 height 属性

    public Elephant(String name, int weight, int id, int height) {
        super(name, weight, id, 0);
        this.height = height; // 初始化 height 属性
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 大象：咆哮一声");
    }

    // 添加 getter 方法以访问 height
    public int getHeight() {
        return height;
    }
}