import java.util.*;
class Slution {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int start = 0;
        int last = 0;
        boolean flag = false;
        int currsum = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {

            currsum += arr[i];

            if (currsum >= s) {
                last = i;

                while (s < currsum && start < last) {

                    currsum -= arr[start];
                    ++start;
                }

                if (currsum == s) {
                    res.add(start + 1);
                    res.add(last + 1);

                    flag = true;
                    break;
                }
            }
        }

        if (flag == false) {
            res.add(-1);
        }

        return res;
    }
}
public class IndexesSubArraySUM {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int n=5;
        int s=12;
        Slution sc = new Slution ();
        ArrayList<Integer> res =sc.subarraySum(arr,n,s);
        System.out.println(res);
    }
}
