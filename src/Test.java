import java.util.*;

class Test {

    public static void main(String []arg){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> binary = new ArrayList<>();
        int s = 0, t=0;
        int remindar = 0;
        while (n > 0) {
            remindar = n%2;
            n=n/2;
            if(remindar==1) {
                s++;
                if(s>=t)
                    t=s;
            } else {
                s=0;
            }
        }
        System.out.println(t);
        scanner.close();
    }
}

