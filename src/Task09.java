import java.util.Scanner;

public class Task09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую координату");
        int y1= scanner.nextInt();
        System.out.println("Введите вторую координату");
        int y2 = scanner.nextInt();

        if(y1 > 0){
            System.out.println("подъём");
        }
        if(y2<0){
            System.out.println("вниз");
        }
        else{
            System.out.println("отвесная дорога");
        }
    }
}
