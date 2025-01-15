import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Заполните массив:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        if (size < 2) {
            System.out.println("Массив должен иметь более двух элементов.");
        } else {
            int largestNum = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : array) {
                if (num > largestNum) {
                    secondLargest = largestNum;
                    largestNum = num;
                } else if (num > secondLargest && num != largestNum) {
                    secondLargest = num;
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("There is no second largest element.");
            } else {
                System.out.println("The second largest number is: " + secondLargest);
            }
        }
    }
}
