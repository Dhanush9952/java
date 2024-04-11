import java.util.* ;
import java.io.*;
class PowerOfNumber {
public static void main(String args[]) {
//int total =1;
Scanner sc= new Scanner(System.in);
int num = sc.nextInt();//2
int pow = sc.nextInt();//5
int var =1;

while(pow!=0){
var=var*num;
pow--;
}

System.out.println(var);

}
}