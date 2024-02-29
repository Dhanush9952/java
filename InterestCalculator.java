import java.io.*;

class InterestCalculator
{
public static void main(String args[]) //throws IOException 
{ 
try{
//Float principalAmount = new Float(0);
//Float rateOfInterest = new Float(0);
//int numberOfYears = 0;
//DataInputStream in = new DataInputStream(System.in);	// DataInputStream class is defined in 'io' package, 'in' is the object. 
float principalAmount = 0;
float rateOfInterest = 0;
int numberOfYears = 0;
String tempString;
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//BufferedReader & InputStreamReader classes are defined in 'io' package, 'reader' is the object

System.out.println("Enter Principal Amount: ");
System.out.flush();								//clean the buffer
tempString = reader.readLine();
principalAmount = Float.parseFloat(tempString);	//string value is converted into float value

System.out.println("Enter Rate of Interest");
System.out.flush();
tempString = reader.readLine();
rateOfInterest = Float.parseFloat(tempString);

System.out.println("Enter Number of Year");
System.out.flush();
tempString = reader.readLine();
numberOfYears = Integer.parseInt(tempString);	// converts string into integer

// Input is over: calculate the interest
float interestTotal = principalAmount*rateOfInterest*numberOfYears;
System.out.println("Total Interest = " + interestTotal) ;
System.out.printf("Formatted Output = %.4f\n", interestTotal) ;
System.out.printf("Width of 20 characters before decimal = %20.4f\n", interestTotal) ;
}
catch(Exception ex) { }
}
}