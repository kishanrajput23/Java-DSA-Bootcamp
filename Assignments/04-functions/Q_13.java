import java.util.*;

public class Q_13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
      
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        
        System.out.print("The prime numbers are : ");
      
        for (int i=num1; i<=num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
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
