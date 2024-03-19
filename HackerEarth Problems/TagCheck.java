import java.io.BufferedReader;
import java.io.InputStreamReader;

class TagCheck {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        char[] ch = name.toCharArray();
        int sum = 0;
        if (name.length() != 9) {
            System.out.println("invalid");
        } else if (ch[2] == 'A' || ch[2] == 'E' || ch[2] == 'I' || ch[2] == 'O' || ch[2] == 'U' || ch[2] == 'Y') {
            System.out.println("invalid");
        } else {
            int even1 = (ch[0] + ch[1]) % 2;
            if (even1 == 0) {
                int even2 = (ch[3] + ch[4]) % 2;
                if (even2 == 0) {
                    int even3 = (ch[4] + ch[5]) % 2;
                    if (even3 == 0) {
                        int even4 = (ch[7] + ch[8]) % 2;
                        if (even4 == 0) {
                            System.out.println("valid");
                        } else {
                            System.out.println("invalid");
                        }
                    } else {
                        System.out.println("invalid");
                    }
                } else {
                    System.out.println("invalid");
                }
            } else {
                System.out.println("invalid");
            }
        }
    }
}
