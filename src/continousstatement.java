public class continousstatement {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {

            if(i%2 ==0){
                if(i == 8){
                    continue;
                }
                System.out.println(i);
            }

        }
    }
}

