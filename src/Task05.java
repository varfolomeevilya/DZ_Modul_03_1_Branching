import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Введите даты рождения человека");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.print("Овца");
                break;
            case 2:
                System.out.print("Свиньи");
                break;
            case 3:

                System.out.print("Козла");
                break;
            case 4:

                System.out.print("Кролика");
                break;
            case 5:

                System.out.print("Дракона");
                break;
            case 6:

                System.out.print("Тигра");
                break;
            case 7:

                System.out.print("Змеи");
                break;
            case 8:
                System.out.print("Заяц");
            case 9:

                System.out.print("Лощадь");
                break;
            case 10:

                System.out.print("Петух");
                break;
            case 11:

                System.out.print("Собака");
                break;

            case 12:
                System.out.print("Обезьяна");
                break;
            case 13:
                System.out.print("Быка");
                break;
            case 14:
                System.out.print("Крыса");
                break;
        }
    }
}
