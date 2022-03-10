import java.util.*;

public class Q_9 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter a number : ");
      int num = sc.nextInt();
      int factorial = fact(num);
      System.out.println("The factorial of given number is " + factorial);
    }
    public static int fact(int num) {
        int product = 1;
        if (num==0 || num==1) {
            return 1;
        }
        for (int i=1; i<=num; i++) {
            product *= i;
        }
        return product;
    }
}
