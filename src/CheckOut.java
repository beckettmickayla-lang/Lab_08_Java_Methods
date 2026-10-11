import java.util.Scanner;
public class CheckOut {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double totalCost = 0.0;
    boolean moreItems;

    System.out.println("Enter the price of each item between $0.50 and $10.00");

    do {
        double price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
        totalCost  += price;

        moreItems = SafeInput.getYNConfirm(in, "Do you have more items (y/n)?");
    } while (moreItems);

    System.out.printf("\n Your total cost is: $%.2f", totalCost);
    in.close();
}

}
