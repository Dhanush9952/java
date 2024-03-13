import java.util.Scanner;
class OddEven {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int even=0,odd=0,last;
        while(n!=0)
        {
            last=n%10;
            if(last%2==0)
            {
                even=even+last;
            }
            else
            {
                odd=odd+last;
            }
            n=n/10;
        }
        System.out.println("Sum of Even numbers: " +even);
		System.out.println("Sum of Odd numbers: " +odd);
    }
}