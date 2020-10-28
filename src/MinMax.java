import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {

        // Complete the miniMaxSum function below.
        public static void main(String[] args) {
            List<Long> temp = new ArrayList<Long>();
            int[] arr = {7,69,2,221,8974};
            for (int i=0 ; i<=arr.length-1; i++) {
                Long sum = 0L;
                for (int j=0; j<=arr.length-1;j++) {
                    sum = sum + arr[j];
                }
                temp.add(sum - arr[i]);
            }
            System.out.print(Collections.min(temp) + " " + Collections.max(temp));

        }
}
