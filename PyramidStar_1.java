
/*
 *          ***
 *           **
 *            *
 */
import java.util.*;

public class PyramidStar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = x; i >= 1; i--) {
            // ith row
            // print Space n-i
            for (int j = 1; j <= x - i; j++) {
                System.out.print(' ');
            }
            // print star 2*i-1
            for (int j = 1; j <= 1 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}