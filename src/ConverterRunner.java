import java.math.BigDecimal;
import java.util.Scanner;

public class ConverterRunner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("What is Bitcoin price today?");
        double bitcoinPrice = in.nextDouble();

        System.out.println("How much $ do you have?");
        double dollarsAmount = in.nextDouble();

        double availableAmount = dollarsAmount / bitcoinPrice;
        System.out.println("You can buy " + availableAmount + " BTC");
    }
}
