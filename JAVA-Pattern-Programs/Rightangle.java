public class Righttraingle{
    public static void main(String[] args) {


        for (int i = 1; i < 6; i++) {

            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" *");
            }

            System.out.println();

        }
    }
}
