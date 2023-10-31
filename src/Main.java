import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Введите список животный(1-Собака 2-Кошка 3-Корова, 4-Свиньи, 5-Лев, 6-Курица, 7-Орёл, 8- Тигр, 9-Змея, 10-Петух)");
        Scanner scanner = new Scanner(System.in);
        int voice = scanner.nextInt();
        switch(voice){
            case 1:
                System.out.println("Лай");
                break;
            case 2:
                System.out.println("Мяуконье");
                break;
            case 3:
                System.out.println("Мычание");
                break;
            case 4:
                System.out.println("Хрюкают");
                break;
            case 5:
                System.out.println("Рык");
                break;
            case 6:
                System.out.println("Кудахтанье");
                break;
            case 7:
                System.out.println("Клёкот");
                break;
            case 8:
                System.out.println("Рычание");
                break;
            case 9:
                System.out.println("Шипение");
                break;
            case 10:
                System.out.println("Кукареконье");
        }

    }
}