import java.util.Scanner;
public class First{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (((a > b) && (a < c)) || ((a < b) && (a > c))) {
            System.out.println("Средний значения:" + a);
        } else if (((b > a) && (b < c)) || ((b < a) && (b > c))) {
            System.out.println("Средний значения:" + b);
        } else if (((c > a) && (c < b)) || ((b < c) && (c > b))) {
            System.out.println("Средний значения:" + c);
        } else {
            System.out.println("Такого значения нет");
        }

    }
}