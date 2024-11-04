import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //Ask the user to input the subtotal and gratuity rate
        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        //Calculate the gratuity and the end total
        double gratuity = subtotal * (gratuityRate/100);
        double total = subtotal + gratuity;

        //Display gratuity and new total
        System.out.print("The gratuity is $" + gratuity + " and the total is $" + total);


    }
}
