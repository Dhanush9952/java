import java.util.* ;
import java.io.*; 
public class CountBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
        while(n!=0)
        {
            int rmsb=n & -n;
            n=n-rmsb;
            ++cnt;
        }
        return cnt;
    }
}