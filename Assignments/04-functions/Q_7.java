import java.util.*;

public class Q_7 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int num = sc.nextInt();
      
      if (isPrime(num)) {
          System.out.println("The given number is Prime");
      }
      else {
          System.out.println("The given number is not Prime");
      }
      
      
    }
    
    public static Boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        else {
            for (int i=2; i<num; i++) {
                if (num%i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
