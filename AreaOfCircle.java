import java.util.Scanner;
public class AreaOfCircle{
public static void main(String args[]){
double radius;
Scanner s = new Scanner(System.in);
System.out.println("Enter the radius: ");
radius = s.nextDouble();
double area = 3.14159 * radius * radius;
System.out.println("Area of circle is: " + area);
}}