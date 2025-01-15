import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите две переменные:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("До: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("После: a = " + a + ", b = " + b);
    }
}
