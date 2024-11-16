import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counts = 0; // 动物总数
        Scanner in = new Scanner(System.in);

        // 输入冰箱的名字和容量
        System.out.println("请输入冰箱的名字和容量");
        String name = in.next();
        int cap = in.nextInt();
        counts += cap;
        Electric iceBox = new IceBox(name, cap);

        // 输入微波炉的名字和容量
        System.out.println("请输入微波炉的名字和容量");
        name = in.next();
        cap = in.nextInt();
        counts += cap;
        Electric microwave = new Microwave(name, cap);

        // 输入洗衣机的名字和容量
        System.out.println("请输入洗衣机的名字和容量");
        name = in.next();
        cap = in.nextInt();
        counts += cap;
        Electric washing = new Washing(name, cap);

        // 模拟生成 10 个随机动物并将它们放入不同的电器中
        for (int i = 0; i < 10; i++) {
            Animal animal = null;
            int r = (int) ((float) Math.random() * 3); // 随机生成 0、1 或 2
            int w = (int) ((float) Math.random() * 2000); // 随机生成重量
            int h = (int) ((float) Math.random() * 500); // 随机生成高度（针对大象）

            // 根据随机数生成不同类型的动物
            switch (r % 3) {
                case 0:
                    animal = new Elephant("大象" + i, w, i, h); // 大象具有随机高度
                    break;
                case 1:
                    animal = new Lion("狮子" + i, w, i);
                    break;
                case 2:
                    animal = new Tiger("老虎" + i, w, i);
                    break;
            }

            if (animal == null) {
                continue;
            }

            // 随机选择将动物放入冰箱、洗衣机或微波炉
            r = (int) ((float) Math.random() * 3);
            switch (r % 3) {
                case 0:
                    animal.enterElectric(iceBox);
                    break;
                case 1:
                    animal.enterElectric(washing);
                    break;
                case 2:
                    animal.enterElectric(microwave);
                    break;
            }
        }

        // 按战斗力排序并展示每个电器中的动物信息
        iceBox.sortShow();
        washing.sortShow();
        microwave.sortShow();
    }
}