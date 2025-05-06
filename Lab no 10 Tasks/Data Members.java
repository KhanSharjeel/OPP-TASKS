import java.util.Scanner;

class Division {
    private int NuM1;
    private int NuM2;

    public Division(int num1, int num2) {
        this.NuM1 = num1;
        this.NuM2 = num2;
    }

    public int getNuM1() {
        return NuM1;
    }

    public void setNuM1(int nuM1) {
        this.NuM1 = nuM1;
    }

    public int getNuM2() {
        return NuM2;
    }

    public void setNuM2(int nuM2) {
        this.NuM2 = nuM2;
    }

    public void divideNumbers() {
        try {
            int result = NuM1 / NuM2;
            System.out.println("Result of " + NuM1 + " / " + NuM2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 10;
        int num2 = 9;

        while (num2 >= 0) {
            System.out.println("Enter two numbers:");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            Division division = new Division(num1, num2);
            division.divideNumbers();

            if (num2 == 0) {
                System.out.println("Terminating as NuM2 reached 0.");
                break;
            }
        }

        scanner.close();
    }
}
