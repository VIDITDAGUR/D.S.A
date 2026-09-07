package Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(4);

        list.add(67);
        list.add(67);
        list.add(67);
        list.add(674);
        list.add(67213);

        System.out.println(list.contains(67));
        System.out.println(list.set(0, 99));
        System.out.println(list.remove(2));
        System.out.println(list);


    }
}
