import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        StringBuffer name = new StringBuffer(sc.nextLine());

        System.out.println("Hello, " + name);
    }
}
