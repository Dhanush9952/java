//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            FibonacciLargeNum obj = new FibonacciLargeNum();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

class FibonacciLargeNum {

    int[] Series(int n) {
        // code here
        int[] res=new int[n+1];
    int M=1000000007;
    res[0]=0;
    res[1]=1;
    for(int i=2;i<=n;i++)
    {
     res[i]=(res[i-2]+res[i-1]) % M;   
    }
    return(res);
    }
}