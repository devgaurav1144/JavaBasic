package arrays;

public class Reversearray {
    public static void main(String[] args) {
         int[] nums = {2,3,4,5};
        int[] reverseArray = new int[nums.length];
        System.out.println("Length : ------"+nums.length);
        for (int i = 0; i < nums.length; i++) {

            reverseArray[i]=nums[nums.length - 1-i];
        }

        for (int i = 0; i < reverseArray.length; i++) {

            System.out.println(reverseArray[i]);
        }
    }
}
