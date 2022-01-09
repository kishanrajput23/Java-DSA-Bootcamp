import java.util.Scanner;

public class Q_1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = in.nextInt();

        int factorial = 1;
        
        if (num==1 || num==0) {
            System.out.print("The factorial of " + num + " is 1");
        }
        else {
            for (int i=1; i<= num; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + num + " is " + factorial);
        }
    }
}