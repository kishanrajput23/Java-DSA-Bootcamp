import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your percentage to be converted into CGPA: ");
        float percent = input.nextFloat();

        System.out.println("Your CGPA is " + (percent / 9.5));
    }
}
