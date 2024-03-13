import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class CreateAndWriteFiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("C:\\Dhanush\\Java\\2024\\Programs\\Files\\Filestasks1.txt");
            int count = 0;
            while (count < 3) {
                String task = input.nextLine();
                f.format("%s%n", task); // Write the task to the file with a new line
                count++;
            }
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
    }

    public static void readFile() {
        try {
            File x = new File("C:\\Dhanush\\Java\\2024\\Programs\\Files\\Filestasks1.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
