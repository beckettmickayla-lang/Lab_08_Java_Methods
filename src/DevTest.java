import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Testing
            //getNonZeroLenString()
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("\n You entered: " + name);

            //getInt
        int age = SafeInput.getInt(in, "Enter your age.");
        System.out.println("\n Your age is: " + age);

            //getDouble
        double hourlyWage = SafeInput.getDouble(in, "Enter your hourly wage");
        System.out.println("\n Your hourly wage is: " + hourlyWage);
    }
}
