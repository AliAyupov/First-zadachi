import java.util.Scanner;

public class Next3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи 3 числа ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a == b) || (b == c) || (a == c)) {
            System.out.println("Среди введенных есть одинаковые");

        } else
            System.out.println("No");
    }
}