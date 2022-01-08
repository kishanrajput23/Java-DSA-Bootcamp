import java.util.Scanner;

class Q_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        float length = in.nextFloat();
        System.out.println("Enter the breadth of the rectangle");
        float breadth = in.nextFloat();
        float area = length * breadth;
        System.out.println("The area of rectangle is " + area);
    }
}