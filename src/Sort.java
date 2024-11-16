import java.util.ArrayList;
import java.util.Comparator;

public class Sort {
    public static void sortByHeight(ArrayList<Elephant> elephants) {
        elephants.sort(Comparator.comparing(Elephant::getHeight));
        System.out.println("大象按高度排序后的结果：");
        for (Elephant elephant : elephants) {
            System.out.println(elephant.name + " - 高度: " + elephant.getHeight());
        }
    }
}
