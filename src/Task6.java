import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputString = sc.next();

        String replacedString = inputString.replace('a', 'b');
        System.out.println("Новая строка: " + replacedString);

    }
}
