import java.util.Scanner;

public class Palindrom {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = sc.nextInt();
        System.out.println(palindrom.isPalindrome(x));
    }
}
