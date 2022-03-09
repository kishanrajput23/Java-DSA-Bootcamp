import java.util.*;

public class Q_3 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your age : ");
      int num = sc.nextInt();
      
      if (isEligible(num)) {
          System.out.println("You are eligible for vote!");
      }
      else {
          System.out.println("Sorry, you're not eligible for vote!");
      }
      
    }
    
    public static Boolean isEligible(int age) {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
