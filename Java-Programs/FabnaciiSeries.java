import java.util.*;
public class FabnaciiSeries{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("How Many Digits You Want In Fabonacii Series: ");
        long a=sc.nextInt();
        long b=0;
        long c=1;
        long d=1;
        System.out.print(+b+" "+c+" "+d);
        for (int i=3;i<a;i++){
            long e=d+c;
            System.out.print(" "+e);
            c=d;
            d=e;
        }

    }
}
