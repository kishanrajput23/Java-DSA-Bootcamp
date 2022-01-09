import java.util.Scanner;

public class Q_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum_negative = 0;
        long sum_even = 0;
        long sum_odd = 0;
        System.out.print("Enter numbers: ");
        int temp = input.nextInt();
        while (temp!=0) {
            if (temp<0) {
                sum_negative += temp;
            }
            if (temp>0) {
                if (temp%2==0) {
                    sum_even += temp;
                } 
                else {
                    sum_odd += temp;
                }
            }
            temp = input.nextInt();
        }
        System.out.println("Sum of Negative numbers : "+sum_negative);
        System.out.println("Sum of Positive odd numbers : "+sum_odd);
        System.out.println("Sum of Positive even number : "+sum_even);
    }
}
