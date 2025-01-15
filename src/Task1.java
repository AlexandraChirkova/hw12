import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Сумма: " + (num1 + num2));
        System.out.println("Умножение: " + (num1 * num2));
        System.out.println("Вычитание: " + (num1 - num2));
        System.out.println("Деление: " + (num1 / num2));
        System.out.println("Остаток от деления: " + (num1 % num2));
    }
}
