import java.util.*;
class FirstProgram{
    public static void main(String args[]){
        System.out.println("Hello World");
		int numbers [ ] = new int [100];
		numbers[1] = 50;
		numbers[2] = 100;
		numbers[3] = 100;
		numbers[5] = 100;
		numbers[99] = 100000;
		for(int init = 0; init<5; init++){
		System.out.println(numbers[init]);
		}
		System.out.println(numbers[99]);
    }
}