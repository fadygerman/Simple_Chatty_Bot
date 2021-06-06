import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = 1;
        for (int i = Math.abs(num1); i < Math.abs(num2); i++){
            sum = Math.abs(sum) * Math.abs(i);
        }
        System.out.println(Math.abs(sum));
    }
}
