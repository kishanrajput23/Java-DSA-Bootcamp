import java.util.Scanner;

public class Q_18 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of pyramid");
        float length = in.nextFloat();
        System.out.println("Enter the width of pyramid");
        float width = in.nextFloat();
        System.out.println("Enter the height of pyramid");
        float height = in.nextFloat();
        double volume = (length * width * height) / 3;
        System.out.println("The volume of pyramid is " + volume);
    }
}
