import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Testing
            //getNonZeroLenString()
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("\n You entered: " + name);

            //getInt
        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("\n Your age is: " + age);

            //getDouble
        double hourlyWage = SafeInput.getDouble(in, "Enter your hourly wage");
        System.out.println("\n Your hourly wage is: " + hourlyWage);

            //getRangedInt
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        System.out.println("\n Your birth month is: " + month);

            //getRangedDouble
        double grade = SafeInput.getRangedDouble(in, "Enter your grade", 0.0, 100.0);
        System.out.println("\n Your grade is: " + grade);

            //getYNConfirm
        boolean answer = SafeInput.getYNConfirm(in, "Do you find Java coding enjoyable?");
        System.out.println("\n You said: " + answer);

            //getRegExString
        //Test name
        String namePattern = SafeInput.getRegExString(in, "Enter your first name (letters only!)", "^[A-Za-z]+$");
        System.out.println("\n Your name is: " + namePattern);

        //Test email
        String email = SafeInput.getRegExString(in, "Enter a valid email address", "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$");
        System.out.println("Your email is: " + email);
    }
}
