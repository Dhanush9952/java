import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountPrime {
    int ans = 0;
    int totalPrime(int s,int e){
        for(int i = s; i <= e; i++){
            int flag = 1;
        for(int j = 2; j <= Math.sqrt(i); j++){
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            ans++;
        }
        }return ans;
    }
}

class PrimeNumberInRange {
    public static void main(String args[]) {
        CountPrime obj = new CountPrime();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(obj.totalPrime(s, e));
    }
}