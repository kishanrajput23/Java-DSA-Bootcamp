import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args){
        long amount,deppercent,year,temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount : ");
        amount = in.nextLong();

        System.out.print("Enter Depreciation percentage : ");
        deppercent = in.nextLong();

        System.out.print("Enter  number of years : ");
        year = in.nextLong();

        temp = amount;

        for(int i=0; i<year; i++) {
            temp = ((100 - deppercent) * temp) / 100;
        }
        
        System.out.println("after depreciation = "+temp);
    }
}
