import java.util.Scanner;

public class ArmstrongProblem {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N=0;
        System.out.println("Enter A number: ");
        int S=sc.nextInt();
        int n=S;

        while(S!=0){
            int r=S%10;
            N=N+((r)*(r)*(r));
            S=S/10;
        }
        if(N==n){
            System.out.println("It is a Armstrong Number");
        }else System.out.println("It is not a Armstrong number");


    }
}
