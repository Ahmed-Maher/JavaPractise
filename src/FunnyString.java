import java.util.ArrayList;
import java.util.List;

class FunnyString {

    public static void main(String[] args) {
        String s = "bcxz";
        StringBuffer sFun =  new StringBuffer(s);
        int[] ar = new int[s.length()];
        int[] br = new int[s.length()];
        for (int i = 0; i <= s.length()-1 ; i++) {
            ar[i] = ((int) s.charAt(i));
        }
        StringBuffer sFunReverse =  sFun.reverse();
        for (int i = 0; i <= s.length()-1 ; i++) {
            br[i] = ((int) sFunReverse.charAt(i));
        }

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (int i = 0; i < s.length()-1 ; i++) {
            l1.add(Math.abs(ar[i] - ar[i + 1]));
            l2.add(Math.abs(br[i] - br[i + 1]));
        }

        if (l1.equals(l2)) {
            System.out.println("Funny");
        } else {
            System.out.println("Not Funny");
        }




       // StringBuffer sReverse = s.reverse();
       // System.out.println(s);
       // System.out.println(sReverse);
       // int[] ar2 = new int[s.length()];

    }
}
