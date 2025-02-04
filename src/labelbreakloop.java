public class labelbreakloop {

    public static void main(String[] args) {
        outerLoop: // Label for the outer loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 && j == 3) {
                    System.out.println("Breaking out of both loops at i=" + i + ", j=" + j);
                    break outerLoop; // Breaks out of the outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        System.out.println("Exited the loops.");


                innerLoop: // Label for the outer loop
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (i == 3 && j == 3) {
                            System.out.println("Skipping rest of iteration for i=" + i);
                            continue innerLoop; // Skips to the next iteration of the outer loop
                        }
                        System.out.println("i=" + i + ", j=" + j);
                    }
                }
                System.out.println("Completed all iterations.");



    }





}
