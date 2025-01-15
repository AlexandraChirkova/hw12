import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Заполните массив:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("Сумма элементов: " + sum);
    }
}
