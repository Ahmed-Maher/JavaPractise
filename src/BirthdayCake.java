import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCake {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        int[] ar = {3,2,1,3};
        int count = 0;
        for (int i=0; i<ar.length; i++){
            l.add(ar[i]);
        }

        for (int i=0; i<ar.length; i++) {
            if (Collections.max(l) == l.get(i)) {
                count = count + 1;
            }
        }
        System.out.print(count);
    }
}
