import java.util.Scanner;

public class Q_20 {
    static int hcf(int a,int b){
        if(b==0) return a;
        return hcf(b,a%b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("HCF : "+hcf(a,b));
    }
}