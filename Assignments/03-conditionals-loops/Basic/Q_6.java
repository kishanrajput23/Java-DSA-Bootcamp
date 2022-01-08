import java.util.Scanner;

public class Q_6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of daigonal1 of rhombus");
        float daigonal1 = in.nextFloat();
        System.out.println("Enter the length of daigonal1 of rhombus");
        float daigonal2 = in.nextFloat();
        float area = (daigonal1 * daigonal2) / 2;
        System.out.println("The area of rhombus is " + area);
    }
}
