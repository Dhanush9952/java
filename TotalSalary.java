import java.util.* ;
import java.io.*;
class TotalSalary {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
float basicSalary = sc.nextInt();
char grade = sc.next().charAt(0);

// Calling the functions and capturing the results
float hra = hra(basicSalary);
float da = da(basicSalary);
float allow = allow(basicSalary, grade);
float pf = pf(basicSalary);

// Calculate the total salary
float totalSalary = basicSalary + hra + da + allow - pf;

// Print the integral part of the total salary
System.out.println(Math.round(totalSalary));
}

// Function to calculate HRA
public static float hra(float basicSalary) {
return basicSalary * 20/100;
}

// Function to calculate DA
public static float da(float basicSalary) {
return basicSalary * 50/100;
}

// Function to declare allowance
public static float allow(float basicSalary, char grade) {
float allowance = 0;
if (grade == 'A') {
allowance = 1700;
} else if (grade == 'B') {
allowance = 1500;
} else
{
allowance = 1300;
} // Removed the else block to ensure allowance is not set to 0 by default
return allowance;
}

// Function to calculate PF
public static float pf(float basicSalary) {
return basicSalary * 11/100;
}

}