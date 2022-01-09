import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Price Of Product");
        double price = in.nextDouble();

        double discount = 0;
        
        if(price>1000){
            discount = price*0.1;
        }
        else if(price>500){
            discount = price*0.2;
        }
        else{
            discount = price*0.3;
        }
        
        double total = price-discount;
        System.out.println("Total Price Of Product Is "+total);
        System.out.println("Discount Of Product Is "+discount);
    }
}
