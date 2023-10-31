import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        double a = scanner.nextInt();
        System.out.println("Введите b");
        double b = scanner.nextInt();
        System.out.println("Введите c");
        double c = scanner.nextInt();
        System.out.println("Введите дискраминат");
        double d = scanner.nextInt();
        double x1;
        double x2;
        d = (-b) * b-4 * a * c;
        if(d>0){
            x1=((-b)+ Math.sqrt(d))/(2 * a);
            x2=((-b) - Math.sqrt(d))/( 2 * a);
            System.out.println("Корень есть");
        }
        if(d==0){
            x1=(-b/(2*a));
            System.out.println("один корень");
        }
        if(d<0){
            System.out.println("Корней нет");
        }
    }
}
