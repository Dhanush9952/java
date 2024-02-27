import java.util.Scanner;
public class GreatestOfThree{
public static void main(String args[]){
int value1, value2, value3;
Scanner s = new Scanner(System.in);
System.out.println("Enter three numbers: ");
value1 = s.nextInt();
value2 = s.nextInt();
value3 = s.nextInt();
if(value1 > value2 && value1 > value3){
	System.out.println(value1 + " is the greatest number");
} else if(value2 > value1 && value2 > value3){
	System.out.println(value2 + " is the greatest number");
}
else {
	System.out.println(value3 + " is the greatest number");
}
}
}