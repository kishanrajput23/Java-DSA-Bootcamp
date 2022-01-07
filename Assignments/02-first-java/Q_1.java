import java.util.Scanner;

public class Q_1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = input.nextInt();

        if(num%2==0) {
            System.out.println(num + " is an Even Number.");
        }
        else {
            System.out.println(num + " is Odd Number.");
        }
    }
}