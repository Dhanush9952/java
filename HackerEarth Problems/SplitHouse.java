import java.util.Scanner;
class SplitHouse {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
	int n = sc.nextInt(); 
	String name = sc.next(); 
	
	if(name.contains("HH")) { 
	System.out.println("NO"); 
	} else { 
	name= name.replace('.', 'B'); 
	System.out.println("YES"); 
	System.out.print(name); 
	}
    }
}
