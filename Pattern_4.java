
/*
 * 1
 * 23
 * 345
 * 4567
 */
import java.util.*;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        int i = 1;
        while (i <= x) {
            int p = i;
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
