import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Dave on 1/18/17.
 */

class Unit4Lab4 {
    // tester class
    public static void main(String[] args) {
        Integer[][] intArray = { {0,1,2,3}, {3,2,1,0}, {3,5,6,1}, {3,8,3,4} };
        String [][] stringArray = { {"a", "b", "c"}, {"A", "B", "C"} };

        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(DoGenericStuffWithMyGenericFriends.Max(intArray));
        System.out.println(DoGenericStuffWithMyGenericFriends.Max(stringArray));

        System.out.println();
        System.out.println("Before Shuffle");

        for (Object s: arrayList) {
            System.out.print(s + " ");
        }

        // call shuffle
        DoGenericStuffWithMyGenericFriends.shuffle(arrayList);

        // print again
        System.out.println();
        System.out.println("After Shuffle");

        for (Object s: arrayList) {
            System.out.print(s + " ");
        }
    }
}

class DoGenericStuffWithMyGenericFriends {

    // find max in 2D array
    public static < T extends Comparable<T>> T Max(T[][] array) {
        // set max
        T max = array[0][0];
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c++) {
                if (array[r][c].compareTo(max) > 0) {
                    max = array[r][c];
                }

            }
        }
        return max;
    }

    // more methods :(

    public static <E> void shuffle (ArrayList<E> list) {
        for (int i = 0; i < list.size()*3; i++){

            int x = (int)(Math.random() * (list.size()));
            int y = (int)(Math.random() * (list.size()));

            Collections.swap(list, x, y);
        }
    }
}
