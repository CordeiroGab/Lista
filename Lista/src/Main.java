import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("John");
        list.add("Jane");
        list.add("Bob");
        list.add("Richard");
        list.add("Richael");


        list.add(2, "Mary");

        System.out.println(list.size());

        list.remove(1 );


        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("________________________________");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("________________________________");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("________________________________");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("________________________________");
        String name = list.stream().filter(x ->x.charAt(0) == 'F').findFirst().orElse(null);
        System.out.println(name);

    }
}