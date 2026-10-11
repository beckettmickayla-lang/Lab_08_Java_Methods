import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args)
    {
        int favInt = 0;
        double favDouble = 0;
        Scanner in = new Scanner(System.in);

        favInt = SafeInput.getInt(in,"Enter your favorite integer");
        System.out.println("\n Your favorite integer is " + favInt);
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("\n Your favorite double is " + favDouble + "\n Your favorite numbers are " + favInt + " and " + favDouble);

    }
}
