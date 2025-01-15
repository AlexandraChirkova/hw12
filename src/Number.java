import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
        System.out.println("введите число: ");
        int x = scanner.nextInt();
        System.out.println(number.numberOfSteps(x));
    }

    public int numberOfSteps (int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
