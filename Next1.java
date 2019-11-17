
    import java.util.Scanner;
    public class Next1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число");
            int a = in.nextInt();
            if (a <= 0)
                a = -a;
            else if (a >= 1)
                a = a - 1;
            System.out.println("Длина отрезка:"+a);
        }
    }

