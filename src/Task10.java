import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер подъезда");
        int Podiezd= scanner.nextInt();
        System.out.println("Введите номер этажа");
        int N =scanner.nextInt();
        System.out.println("Введите количество номер квартиры на этажах");
        int M =scanner.nextInt();
        int podiezd=(N-1)/(M*9)+1;
        boolean t =true;
        if(t){
            System.out.println(N);
        }
        if(t){
            System.out.println(M);
        }
        if(t){
            System.out.println(Podiezd);
        }


    }
}
