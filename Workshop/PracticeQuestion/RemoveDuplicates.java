import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        Set<Integer> set = new HashSet<>(list);

        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("Original List: " + list);
        System.out.println("Without Duplicates: " + uniqueList);
    }
}