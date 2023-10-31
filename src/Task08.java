import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х");
        int x = scanner.nextInt();
        System.out.println("Введите y");
        int y = scanner.nextInt();
        if ((x % 3) == 0) {
            System.out.println(" Yes ");
        }
        if ((y % 5) == 0) {
            System.out.println(" False ");
        }
    }
}
