import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.forEach(System.out::println);
    }

}
