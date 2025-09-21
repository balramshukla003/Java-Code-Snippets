import java.util.Scanner;

class case_changing{
    public static void main(String[] args) {

        String a = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        a = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (b < 90 && b > 64) {
                b = (char) (b + 32);
                System.out.print(b);
            } else if (b < 124 && b > 96) {
                b = (char) (b - 32);
                System.out.print(b);
            } else System.out.print(b);
        }
    }
}
