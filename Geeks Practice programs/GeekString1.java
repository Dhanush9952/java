
import java.io.*;
import java.util.*;

public class GeekString1 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String c = "Good Morning Hey Dude";
        for(String str : c.split(" ")){
            if(str.length() % 2 == 0){
                System.out.println(str);
            }
        }
    }
    
}