package arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListComparison {
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList: " + arrayList);

        // LinkedList Example
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList: " + linkedList);

        // Inserting elements at the beginning of both lists
        arrayList.add(0, 5);  // Slower for ArrayList as it shifts elements
        linkedList.addFirst(5);  // Faster for LinkedList as no shifting occurs
        linkedList.add(9);
        linkedList.remove(3);
        System.out.println("ArrayList after adding 5 at the beginning: " + arrayList);
        System.out.println("LinkedList after adding 5 at the beginning: " + linkedList);
    }
}
