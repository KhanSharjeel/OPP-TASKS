import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayName;
        String dayType;


        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                dayType = "Weekday";
                break;
            case 2:
                dayName = "Tuesday";
                dayType = "Weekday";
                break;
            case 3:
                dayName = "Wednesday";
                dayType = "Weekday";
                break;
            case 4:
                dayName = "Thursday";
                dayType = "Weekday";
                break;
            case 5:
                dayName = "Friday";
                dayType = "Weekday";
                break;
            case 6:
                dayName = "Saturday";
                dayType = "Weekend";
                break;
            case 7:
                dayName = "Sunday";
                dayType = "Weekend";
                break;
            default:

                dayName = "Invalid input";
                dayType = "";
        }

        if (dayName.equals("Invalid input")) {
            System.out.println(dayName);
        } else {

            System.out.println("Day: " + dayName);
            System.out.println("Type: " + dayType);
        }

        scanner.close();
    }
}
