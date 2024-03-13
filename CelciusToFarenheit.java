import java.util.Scanner;

public class CelciusToFarenheit {
    //your code goes here
    static double fahr(double c){
        double f = 1.8 * c + 32;
        return f;
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double celcius = sc.nextDouble(); 
        System.out.println(fahr(celcius));
    }
}