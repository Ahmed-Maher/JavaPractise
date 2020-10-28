import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = s.nextInt();
        int temp = 0;
        int count = 0;
        //logic to check if the given number is Armstrong
        //Armstrong number is the number which is the sum of the cubes of all its unit,
        // tens and hundred digits for three-digit numbers.
        //153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153 TC: 153, 1634
        while (num > 0) {
            int c = num % 10;
            num = num / 10;
            temp = temp + (c*c*c);
        }
        System.out.println(temp);
    }
}
