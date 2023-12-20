
/* 1
 * 12
 * 123
 * 1234
 */
import java.util.*;

public class Pattern_1 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int i = 1;
        while (i <= x) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
