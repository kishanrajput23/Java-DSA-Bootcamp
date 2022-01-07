import java.util.Scanner;

public class Q_8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String str, rev = "";
        System.out.println("Enter the string : ");

        str = in.nextLine();
        int len = str.length();

        for (int i=len-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("The given string is Palindrome");
        }
        else {
            System.out.println("The given string is not a Palindrome");
        }
    }
}