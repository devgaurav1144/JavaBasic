package MultiDimension;

public class MultiDimension {


    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(arr[1][2]);


//        Traversing a 2D Array (Printing all elements)

        // Loop through rows
        for (int i = 0; i < arr.length; i++) {
            // Loop through columns
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

//        Jagged Arrays (Arrays with different column sizes)


        int[][] jaggedArr = {
                {1, 2},
                {3, 4, 5},
                {6}
        };

// Printing jagged array
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }


    }

    }

