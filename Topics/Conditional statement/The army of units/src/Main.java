import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        if (units < 1) {
            System.out.print("no army");
        } else if (units >= 1 && units < 20) {
            System.out.print("pack");
        } else if (units >= 20 && units < 250) {
            System.out.print("throng");
        } else if (units >= 250 && units < 1000) {
            System.out.print("zounds");
        } else {
            System.out.print("legion");
        }
    }
}
