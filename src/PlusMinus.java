import java.lang.reflect.Array;

public class PlusMinus {

    public static void main(String[] args) {
        int[] arr = {-4,3,-9,0,4,1};
        double pos=0,neg=0,z=0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                z++;
            }
        }
        System.out.printf("%1$.6f\n", pos/arr.length);
        System.out.printf("%1$.6f\n", neg/arr.length);
        System.out.printf("%1$.6f", z/arr.length);

    }
}

