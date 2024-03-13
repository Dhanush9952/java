import java.util.Formatter;

public class File1 {
   public static void main(String[ ] args) {
  try {
    Formatter f = new Formatter("C:\\Dhanush\\Java\\2024\\Programs\\File1.txt");
    f.format("%s %s %s", "1","John", "Smith \r\n");
    f.format("%s %s %s", "2","Amy", "Brown \r\n");
	f.format("%s %s %s", "3","Dhanush", "Kr");
    f.close();    
  } catch (Exception e) {
    System.out.println("Error");
  }
  }
}