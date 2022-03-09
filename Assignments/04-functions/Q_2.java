import java.util.*;

public class Q_2 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int num = sc.nextInt();
      
      if (isEven(num)) {
          System.out.println("The given number is an Even Number");
      }
      else {
          System.out.println("The given number is an Odd Number");
      }
      
    }
    
    public static Boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
