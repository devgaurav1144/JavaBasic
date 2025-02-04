package Functions;

public class Functionmethod
{
    public static int addNumbers(int a, int b) {
        return a + b; // Returns sum
    }

    public  int summup(int a, int b) {
        return a + b; // Returns sum
    }


    public static void main(String[] args) {
        int sum = addNumbers(5,10);
        System.out.println(sum);
        Functionmethod fm = new Functionmethod();
        int sumupresult = fm.summup(5,9);
        System.out.println(sumupresult);
    }
}
