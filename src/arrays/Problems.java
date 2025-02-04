package arrays;

public class Problems {
    public static void main(String[] args) {
        int[] values = {25,45,90,56,41};
        int max = values[0];
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if(max < values[i]) {
                max = values[i];
            }
        }

        for (int i = 0; i < values.length; i++) {
            if(min > values[i]) {
                min = values[i];
            }
        }
        System.out.println("Minimum Value is : ---------"+min);

        System.out.println("Maximum Value is : ---------"+max);
    }
}
