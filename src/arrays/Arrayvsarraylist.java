package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Arrayvsarraylist {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[5];
        numbers[0]= 1;
        numbers[1] =2;
        numbers[2] =2;
        numbers[3] =3;
        numbers[4] =4;

        List<Integer> numlist = Arrays.asList(numbers); /// Error: Cannot add element to fixed-size list.
        ArrayList<Integer> newArrayList = new ArrayList<>(Arrays.asList(numbers));
        try {
           // numlist.add(6);
            newArrayList.add(6);
            System.out.println(newArrayList);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: Cannot add element to fixed-size list.");
        }

    }
}
