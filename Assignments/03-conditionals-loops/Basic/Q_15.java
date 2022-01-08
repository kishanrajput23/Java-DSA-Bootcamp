import java.util.Scanner;

public class Q_15 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of prism");
        float base = in.nextFloat();
        System.out.println("Enter the height of prism");
        float height = in.nextFloat();
        float volume = base * height;
        System.out.println("The volume of prism is " + volume);
    }
}
