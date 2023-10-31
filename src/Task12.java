import java.util.Scanner;

public class Task12 {
    public static void main(String[] args){
        System.out.println("Введите номер билета");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x>0){
            System.out.print("Yes");

        }
        if(y<0) {
            System.out.print("False");
        }
    }
}

