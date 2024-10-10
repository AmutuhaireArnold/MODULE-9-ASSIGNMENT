import java.util.Arrays;
import java.util.List;

public class question5 {
    // Generic method
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C");
        List<Integer> intList = Arrays.asList(1, 2, 3);

        System.out.println("String List:");
        printList(stringList);

        System.out.println("Integer List:");
        printList(intList);
    }
}