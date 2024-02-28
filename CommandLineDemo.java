import java.util.*;
class CommandLineDemo{
	public static void main(String args[]){
		if(args.length>0){
		System.out.println("The arguments are: ");
		for(String var:args){
			System.out.println(var);
		}
		} else {
			System.out.println("No arguments found");
		}
	}
}