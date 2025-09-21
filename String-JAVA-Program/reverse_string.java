import java.util.Scanner;

class reverse_string{
    public static void main(String[] args) {

        String a = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        a = sc.nextLine();

        for(int i=a.length();i>0;i--){
            System.out.print(a.charAt(i-1));
        }
    }
}
