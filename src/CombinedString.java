import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CombinedString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            l.add(s.next());
        }



        for ( String string : l) {
            String odd = "";
            String even = "";
            for (int j = 0; j < string.length(); j++) {
                if (j%2 == 1) {
                    odd = odd + string.charAt(j);
               } else {
                    even = even + string.charAt(j);

               }
            }
            System.out.println(even + " " + odd);
        }

    }
}
