import java.util.Scanner;

public class PalindromeProblem {
    public static void main(String[] args) {

        String S, N = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A String :");
        S = sc.nextLine();

        int a = S.length() - 1;

        for (int i = a; i >= 0; i--) {
            N += S.charAt(i);
        }
        if (N.equalsIgnoreCase(S)) {
            System.out.println("Palindrome");
        } else System.out.println("Not a palindrome");

    }
}
