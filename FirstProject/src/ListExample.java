import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Al-Jolanda");
        names.add("Ali");
        names.add("Sara");

        // names.remove("Ali");



        for (String name : names){
            System.out.println(name);
        }
    }
}
