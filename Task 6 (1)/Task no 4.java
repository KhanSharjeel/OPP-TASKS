import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of employee 1: ");
        String name1 = sc.nextLine();

        System.out.print("Enter email of employee 1: ");
        StringBuffer email1 = new StringBuffer(sc.nextLine());

        System.out.print("Enter name of employee 2: ");
        String name2 = sc.nextLine();

        System.out.print("Enter email of employee 2: ");
        StringBuffer email2 = new StringBuffer(sc.nextLine());

        System.out.print("Enter name of employee 3: ");
        String name3 = sc.nextLine();

        System.out.print("Enter email of employee 3: ");
        StringBuffer email3 = new StringBuffer(sc.nextLine());

        System.out.println("Employee Details:");
        System.out.println(name1 + " : " + email1);
        System.out.println(name2 + " : " + email2);
        System.out.println(name3 + " : " + email3);

        sc.close();
    }
}
