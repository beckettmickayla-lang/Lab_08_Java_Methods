import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month (1-12)", 1, 12);
        int maxDays = getMaxDaysOfMonth(month, year);
        int day = SafeInput.getRangedInt(in, "Enter the day of the month you were born", 1, maxDays);
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth 0-23", 0, 23);
        int minutes = SafeInput.getRangedInt(in, "Enter the minutes of the hour for your birth", 0, 59);

        System.out.println("\nYou were born " + month + "/" + day + "/" + year + " at " + hour + ":" + String.format("%02d", minutes));
   in.close();
    }

    // Identify appropriate days per given Month
    public static int getMaxDaysOfMonth(int month, int year) {
        switch (month) {
            case 2:
                // February leap year check
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                }
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}
