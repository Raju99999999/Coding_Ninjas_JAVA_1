import java.util.*;

public class BasicPettarn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        if (0 <= rows && rows <= 50) {
            // Nested loops for rows and columns
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print("*");
                }
                System.out.println(); // Move to the next line after each row
            }

            sc.close(); // Close the scanner to prevent resource leak
        }
    }
}
