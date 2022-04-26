package Task1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator.compare("abc", "cba"));
    }
}
