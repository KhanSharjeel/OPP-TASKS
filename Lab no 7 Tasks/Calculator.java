
class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }


    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed.");
            return 0;
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Division by zero not allowed.");
            return 0.0;
        }
        return a / b;
    }
}


class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Integer
        System.out.println("Integer Operations:");
        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(5, 3));
        System.out.println("Multiply: " + calc.multiply(5, 3));
        System.out.println("Divide: " + calc.divide(10, 2));

        // Double
        System.out.println("\nDouble Operations:");
        System.out.println("Add: " + calc.add(5.5, 3.2));
        System.out.println("Subtract: " + calc.subtract(5.5, 3.2));
        System.out.println("Multiply: " + calc.multiply(5.5, 3.2));
        System.out.println("Divide: " + calc.divide(10.5, 2.5));
    }
}
