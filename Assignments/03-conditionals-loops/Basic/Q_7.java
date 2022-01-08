import java.util.Scanner;

public class Q_7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of equilateral traingle");
        float side = in.nextFloat();
        double area = (Math.sqrt(3) * side * side) / 4;
        System.out.println("The area of equilateral traingle is " + area);
    }
}
