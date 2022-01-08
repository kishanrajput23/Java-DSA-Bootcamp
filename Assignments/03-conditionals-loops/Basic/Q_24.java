import java.util.Scanner;

class Q_24 {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("Enter the number : ");
            int num = in.nextInt();
            if (num==0) {
                break;
            }
            else {
                sum += num;
            }
        }
        System.out.println("The sum of all numbers are " + sum);
    }
}