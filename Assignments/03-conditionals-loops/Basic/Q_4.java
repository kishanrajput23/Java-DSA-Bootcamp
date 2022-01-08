import java.util.Scanner;

public class Q_4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the isosceles traingle");
        float base = in.nextFloat();
        System.out.println("Enter the height of the isosceles traingle");
        float height = in.nextFloat();
        float area = (base * height) / 2;
        System.out.println("The area of isosceles traingle is " + area);
    }
}