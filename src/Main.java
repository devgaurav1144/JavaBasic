import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N:");
        int n = sc.nextInt();
        int sum = 0;
        int evansum = 0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
            if(i%2 ==0) {
                evansum = evansum +i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
        System.out.println(evansum);

        System.out.println("Give Confirmation Y or N");
        char conf = sc.nextLine().charAt(0);
         while (conf == 'Y') {
             System.out.println("Learning ...........");
             System.out.println("Give Confirmation Y or N");
             conf = sc.nextLine().charAt(0);
         }


         sc.close();

    }


}

