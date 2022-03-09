import java.util.*;

public class Q_5 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first number : ");
      int num1 = sc.nextInt();
      
      System.out.print("Enter second number : ");
      int num2 = sc.nextInt();
      
      int Product = prod(num1, num2);
      System.out.println("The product of two given numbers are " + Product);
    }
    
    public static int prod(int a, int b) {
        return a*b;
    }
}
