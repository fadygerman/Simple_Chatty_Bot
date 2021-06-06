import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        String[] name = new String[8];
        for (i = 0; i < 8; i++) {
            name[i] = scanner.next();
        }
        for (i = 7; i >= 0; i--) {
            System.out.println(name[i]);
        }
    }
}