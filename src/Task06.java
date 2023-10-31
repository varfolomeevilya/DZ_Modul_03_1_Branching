import java.util.Scanner;

public class Task06 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int days;
        System.out.print("Введите количество дней");
        int input = in.nextInt();
        System.out.printf("Дней : %d", input / 4);
        input = input % 4;

    }
}
