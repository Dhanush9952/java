import java.util.* ;
import java.io.*; 
class FarenheitToCelcius {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        int sf = sc.nextInt();
        int ef = sc.nextInt();
        int ss = sc.nextInt();
        int i=sf;
        while(i<=ef)
        {
            int celsius=(i-32)*5/9;
            System.out.println(i+" "+celsius);
            i=i+ss;
        }
    }
}