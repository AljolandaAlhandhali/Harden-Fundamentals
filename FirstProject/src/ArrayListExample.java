import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Al-Jolanda");
        names.add("Ali");
        names.add("Sara");

        // names.remove("Ali");


        // System.out.println(names.get(2));

        for (String name : names){
            System.out.println(name);
        }

    }
}
