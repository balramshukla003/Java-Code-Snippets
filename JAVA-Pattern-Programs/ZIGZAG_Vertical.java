class ZIGZAG_Vertical{
    public static void main(String[] args) {
        int a = 0;

        for (int i = 0; i < 120; i++) {

            if (i % 6 < 6) {
                for (int j = 0; j < i % 6; j++) {
                    System.out.print("  ");
                }
                System.out.println(" *");
                a = a + 1;
            }

            if (a == 6) {

                for (int j = 4; j > 0; j--) {
                    System.out.print("  ");
                }
                System.out.println(" *");

                for (int j = 3; j > 0; j--) {
                    System.out.print("  ");
                }
                System.out.println(" *");

                for (int j = 2; j > 0; j--) {
                    System.out.print("  ");
                }
                System.out.println(" *");

                for (int j = 1; j > 0; j--) {
                    System.out.print("  ");
                }
                System.out.println(" *");

                a = 0;

            }


        }
    }
}

