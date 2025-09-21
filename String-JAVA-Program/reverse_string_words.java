import java.util.Scanner;

public class reverse_string_words{
    public static void main(String[] args) {

        String a ;
        int aa = 0, ab = 0, k = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        a=sc.nextLine();

        for (int i = a.length() - 1; i >= 0; i--) {

            if (a.charAt(i) == 32) {

                k = i;

                if (ab == 0) {

                    for (int j = i; j < a.length(); j++) {
                        System.out.print(a.charAt(j));
                    }
                    System.out.print(" ");
                    ab++;

                } else {

                    for (int j = i + 1; j <= aa; j++) {
                        System.out.print(a.charAt(j));
                    }
                }
            }
            aa = k;

            if (i == 0) {
                for (int f = 0; f < aa; f++) {
                    System.out.print(a.charAt(f));
                }
            }
        }
    }
}
