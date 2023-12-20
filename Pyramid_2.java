
/*
 *     1
 *    2 2
 *   3 3 3
 *  4 4 4 4
 */
import java.util.*;

public class Pyramid_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            // ith row
            // print Space n-i
            for (int j = 1; j <= x - i; j++) {
                System.out.print(' ');
            }
            // print star
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
