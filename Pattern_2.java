
/* 1
 * 23
 * 456
 * 78910
 */
import java.util.*;

public class Pattern_2 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int i = 1;
        int p = 1;
        while (i <= x) {
            int j = 1;
            while (j <= i) {
                System.out.print(p);
                p = p + 1;
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
