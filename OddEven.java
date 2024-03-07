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
//	EXPLANATION
/*
Initialize even and odd variables to store the sums of even and odd digits, respectively.
Read an integer n from the user using Scanner.
Iterate over the digits of n using a while loop (while(n!=0)).
Get the last digit of n by taking its modulo with 10 (last = n % 10).
Check if the last digit is even (last % 2 == 0).
If it's even, add it to the even sum (even = even + last).
If it's odd, add it to the odd sum (odd = odd + last).
Remove the last digit from n by dividing it by 10 (n = n / 10).
After processing all the digits, print the sums of even and odd digits.
*/
