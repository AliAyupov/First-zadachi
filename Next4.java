import java.util.Scanner;

public class Next4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи 3 числа ");
        int k;
        int a = in.nextInt();
        k=a;
        int b = in.nextInt();
        int c = in.nextInt();
        if (k<b)
            k=b;

        if(k<c)
            c=k;
            System.out.println("Макс"+k);
    }
}