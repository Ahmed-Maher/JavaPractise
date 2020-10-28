/*

public class StringTest {
    public static void main(String[] args) {
        int n = 3;
        int p = 4;
        if (n < 0 || p < 0) throw Exception {
            throw new Exception("not a")
        } else {
        }
    }

            System.out.println("Bad String");
            int answer=1;
            for (int i = 0; i < 5; i++) {
                 answer = answer * 3;

            }
            System.out.println(answer);
        }
    }
}
*/


import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int aD = scanner.nextInt();
        int aM = scanner.nextInt();

        System.out.println(aD);
        System.out.println(aM);

        //String expectedDate = scanner.next();
        scanner.close();

       // int fine = 0;
        /*int aD = Integer.parseInt(actualDate.split(" ")[0]);
        int aM = Integer.parseInt(actualDate.split(" ")[1]);
        int aY = Integer.parseInt(actualDate.split(" ")[2]);*/

       /* int eD = Integer.parseInt(expectedDate.split(" ")[0]);
        int eM = Integer.parseInt(expectedDate.split(" ")[1]);
        int eY = Integer.parseInt(expectedDate.split(" ")[2]);

        if (aY > eY) {
            fine = 10000;
            System.out.println(fine);
        } else if (aM > eM) {
            fine = 500 * (aM - eM);
            System.out.println(fine);
        } else if (aD > eD) {
            fine = 15 * (aD - eD);
            System.out.println(fine);
        } else {
            System.out.println(fine);
        }*/
    }
}
