import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Next2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числa");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double d;
        double x1;
        double x2;
        if (b * b > 4 * a * c) {
            d = b * b - 4 * a * c;
            x1 = (-b + sqrt(d)) / (2 * a);
            x2 = (-b - sqrt(d)) / (2 * a);

            System.out.println("Корни" + x1 + "," + x2);
        }
    }
}
