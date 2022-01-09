import java.util.Scanner;

public class Q_18 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int num, number, rev = 0;
        System.out.print("Enter the number : ");
        num = in.nextInt();
        number = num;
        while (num != 0) {
            rev = num%10 + rev * 10;
            num /= 10;
        }
        if (number == rev) {
            System.out.println("The given number is palindrome");
        }
        else {
            System.out.println("The given nmber is not palindrome");;
        }

    }
}
