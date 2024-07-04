import java.util.Scanner;

public class TwoDarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Prompt the user to enter the number of columns
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Initialize the 2D array with the given dimensions
        int[][] numbers = new int[rows][columns];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        System.out.println("Enter x :");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] ==x){
                    System.out.println("x is found : ("+ i +"," + j +")");
                }
            }
        sc.close();
        }
    }
}