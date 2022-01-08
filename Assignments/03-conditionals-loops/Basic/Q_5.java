import java.util.Scanner;

public class Q_5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram");
        float base = in.nextFloat();
        System.out.println("Enter the height of the parallelogram");
        float height = in.nextFloat();
        float area = base * height;
        System.out.println("The area of parallelogram is " + area);
    }
}
