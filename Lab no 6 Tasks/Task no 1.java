import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        int upper = 0, lower = 0, digit = 0;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (ch >= 'A' && ch <= 'Z') upper++;
            if (ch >= 'a' && ch <= 'z') lower++;
            if (ch >= '0' && ch <= '9') digit++;
        }

        if (pass.length() < 6) System.out.println("Password must be at least 6 characters.");
        if (upper == 0) System.out.println("Password must have at least one uppercase letter.");
        if (lower == 0) System.out.println("Password must have at least one lowercase letter.");
        if (digit == 0) System.out.println("Password must have at least one digit.");

        if (pass.length() >= 6 && upper > 0 && lower > 0 && digit > 0)
            System.out.println("Password is valid.");

    }
}
