import java.util.Scanner;
class Division {
    private int num1;
    private int num2;


    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }


    public void divide() {
        try {
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Division division = new Division();


        division.setNum1(10);


        for (int i = 9; i >= 0; i--) {
            division.setNum2(i);
            division.divide();
        }

        input.close();
    }
}
