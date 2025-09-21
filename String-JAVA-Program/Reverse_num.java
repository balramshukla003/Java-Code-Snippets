import java.util.Scanner;

public class Reverse_num{
    public static void main(String[] args) {


        int S, N=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :");
        S = sc.nextInt();
        int P=S;
        while(S!=0){

            int r=S%10;
            N=N*10+r;
            S=S/10;

        }
        System.out.println(N);
        System.out.println("Difference :"+(N-P));




    }
}
