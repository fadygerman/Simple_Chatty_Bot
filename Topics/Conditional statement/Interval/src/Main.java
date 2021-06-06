import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int neg = -15;
        if (input > neg && input <= 12 || input > 14 && input < 17 || input >= 19) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
