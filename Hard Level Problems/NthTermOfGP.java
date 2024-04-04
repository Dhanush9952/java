
public class NthTermOfGP {
    
    static int mod = (int)1e9+7;
    public static int nthTermOfGP(int N, int A, int R) {
        if(R==0) return 0;
        long result = (A*power(R, N-1))%mod;
        return (int)result;
    }
    private static long power(int r, int n){
        if(n==0) return 1;
        if(n%2==0){								// if n is even
            long ans = power(r,n/2)%mod;
            ans = (ans*ans)%mod;
            return ans;
        }
        else return r*power(r,n-1)%mod;			// if n is odd
    }

}

