import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Число положительное.");
        } else if (number < 0) {
            System.out.println("Число отрицательно.");
        } else {
            System.out.println("Ноль.");
        }
    }
}
