
/*   1
 *  123
 * 12345
 *1234567
 * 
 */
import java.util.*;

public class Pyramid_Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            // ith row
            // print Space n-i
            for (int j = 1; j <= x - i; j++) {
                System.out.print(' ');
            }
            // print star 2*i-1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
