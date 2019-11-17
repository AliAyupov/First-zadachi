import java.util.Scanner;

public class Next {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число a:");
        int a=in.nextInt();
        System.out.println("Введите число b:");
        int b=in.nextInt();
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("a:"+a+"" +
                "           b:"+b);
    }
}





