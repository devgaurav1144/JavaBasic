public class Nestedloop {

    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for(int i=0;i<5;i++){ ///  response
            int j=0;
            while(j<=i) {
                System.out.print("@");
                j++;
            }
            System.out.println("");
        }
    }
}
