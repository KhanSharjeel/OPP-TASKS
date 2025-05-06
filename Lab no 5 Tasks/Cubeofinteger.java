import java.util.Scanner;

public class Cubeofinteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();

        int cube = num * num * num;
        System.out.println("Cube  is: " + cube);

        scanner.close();
    }
}
