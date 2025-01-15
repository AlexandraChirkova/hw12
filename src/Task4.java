import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int largest = Math.max(n1, Math.max(n2, n3));
        System.out.println("Наибольшее число: " + largest);
    }
}
