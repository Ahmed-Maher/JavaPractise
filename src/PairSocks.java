import java.util.*;

class PairSocks {

    public static void main(String[] args) {

        int n = 5; int k = 2; int max = 0; int tmp=0;

        for (int i=1; i < n; i++) {
            for (int j = i+1; j <=n; j++ ) {
                tmp = i & j;
            if (tmp < k && tmp > max) {
                max = tmp;
            }
            }
        }
        System.out.println(max);
    }
}

/*    Set<Integer> colors = new HashSet<>();
    int pairs = 0;

    for (int i = 0; i < n; i++) {
        if (!colors.contains(c[i])) {
        colors.add(c[i]);
        } else {
        pairs++;
        colors.remove(c[i]);
        }
        }

        System.out.println(pairs);*/
