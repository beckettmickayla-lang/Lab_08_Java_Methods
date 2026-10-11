import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    String firstName = "";
    String lastName = "";
    firstName = SafeInput.getNonZeroLenString(input, "Enter your first name");
    lastName = SafeInput.getNonZeroLenString(input, "Enter your last name");
    System.out.println("Your full name is: " + firstName + " " + lastName);
    }
}