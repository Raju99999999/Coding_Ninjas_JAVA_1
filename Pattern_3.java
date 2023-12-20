
/*
 * 5
 * 54
 * 543
 * 5432
 * 54321
 */
import java.util.*;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, x;
        x = sc.nextInt();
        i = x;
        while (i >= 1) {
            j = x;
            while (j >= i) {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();
            i--;
        }

    }

}
