public class JumpingClouds {

    public static void main(String[] args) {
        int[] c = {0,0,0,0,1,0};
        int count = -1;
        for (int i = 0; i < c.length; i++, count++) {
            if (i<c.length-2 && c[i+2]==0) i++;
        }
        System.out.println(count);
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
