public class ABC_Pyramid {
    public static void main(String[] args) {

        for (int i=0;i<26;i++) {
            char a = 65;
            for (int j = 0; j < i; j++) {
                System.out.print(a + "  ");
                a++;
            }
            System.out.println(" ");
        }

    }
}
