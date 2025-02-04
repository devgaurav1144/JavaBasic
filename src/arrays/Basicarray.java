package arrays;

public class Basicarray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6}; // one way declaration
        int[] values = new int[5]; // Second way declaration
        int[] numValue = {1, 2, 3, 4, 5};

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        for(int i=0;i<numValue.length;i++){
            System.out.println("NEW VALUES:-------------"+numValue[i]);
        }

        //Single-Dimensional Arrays

        values[0] = 12;
        values[1] = 20;

        System.out.println(values);

        // Multi-Dimensional Arrays

        int[][] matrix ={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(matrix[1][2]); // Outputs 6

        for (int num : values) {
            System.out.println(num);
        }

    }
}
