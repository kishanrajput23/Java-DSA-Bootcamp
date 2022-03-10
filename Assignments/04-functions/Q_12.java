import java.util.*;

public class Q_12 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter first number : ");
      int x = sc.nextInt();
      
      System.out.print("Please enter second number : ");
      int y = sc.nextInt();
      
      System.out.print("Please enter third number : ");
      int z = sc.nextInt();
      
      if (isTriplet(x, y, z)) {
          System.out.println("The given numbers are Pythagorean Triplet.");
      }
      else {
          System.out.println("The given numbers are not Pythagorean Triplet.");
      }
    }
    public static Boolean isTriplet(int x, int y, int z) {
        int a = x*x;
        int b = y*y;
        int c = z*z;
        
        if (a == b + c || b == a + c || c == a + b) {
            return true;
        }
        else {
            return false;
    }
    }
}
