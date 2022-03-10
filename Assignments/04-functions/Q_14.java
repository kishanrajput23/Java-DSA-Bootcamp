import java.util.*;

public class Q_14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        
        System.out.print("The sum of " + num + " natural numbers are " + sum(num));
    }
    
    public static int sum(int num) {
        int T=0;
        for (int i=0; i<=num; i++) {
            T += i;
        }
        return T;
    }
}
