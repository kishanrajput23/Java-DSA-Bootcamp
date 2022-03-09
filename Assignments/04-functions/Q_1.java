import java.util.*;

public class Q_1 {
    public static void main(String args[]) {
      System.out.println("Please enter 3 numbers to find greatest among them");
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first number : ");
      int a = sc.nextInt();
      
      System.out.print("Enter second number : ");
      int b = sc.nextInt();
      
      System.out.print("Enter third number : ");
      int c = sc.nextInt();
      
      int large = largest(a, b, c);
      System.out.println("The greatest among three numbers is : " + large);
      
      int small = smallest(a, b, c);
      System.out.println("The smallest among three numbers is : " + small);
    }
    
    public static int largest(int a, int b, int c) {
        if (a>b) {
            if (a>c) {
                return a;
            }
            else{
                return c;
            }
        }
        else {
            if (b>c) {
                return b;
            }
            else {
                return c;
            }
        }
    }
    
    public static int smallest(int a, int b, int c) {
        if (a<b) {
            if (a<c) {
                return a;
            }
            else{
                return c;
            }
        }
        else {
            if (b<c) {
                return b;
            }
            else {
                return c;
            }
        }
    }
}
