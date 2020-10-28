import java.util.*;



public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        sc.close();
        int dig1 = 0;
        int dig2 = 0;

        for (int i = 0, j = a.length-1 ; i < a.length; i++, j--) {
            dig1 +=  a[i][i];
            dig2 +=  a[j][i];
        }

        System.out.println(Math.abs(dig1 - dig2));

    }
}


