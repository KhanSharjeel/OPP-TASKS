import java.util.Scanner;

public class TableDataProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows, cols;

        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        cols = scanner.nextInt();

        int[][] table_data = new int[rows][cols];

        // b. Prompt user to enter data with a proper message
        System.out.println("Enter the elements of the tabledata array:");

        // i. Use nested for loop to initialize array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position" + i + j ;
                table_data[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Array elements (tabledata):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(table_data[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("Array elements in reverse order:");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(table_data[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
