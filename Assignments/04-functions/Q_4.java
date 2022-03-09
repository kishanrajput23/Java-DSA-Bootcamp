import java.util.*;

public class Q_4 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first number : ");
      int num1 = sc.nextInt();
      
      System.out.print("Enter second number : ");
      int num2 = sc.nextInt();
      
      int Sum = sum(num1, num2);
      System.out.println("The sum of given two numbers are " + Sum);
    }
    
    public static int sum(int a, int b) {
        return a+b;
    }
}
