import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.print("Enter a power: ");
        int p = in.nextInt();

        System.out.print(n+" to the power of "+p+" is = ");
        int power = 1;
        
        while(p!=0){
            power *= n;
            p--;
        }
        System.out.print(power);
    }
}
