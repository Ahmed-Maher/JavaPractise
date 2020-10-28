import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class SecondHighNumber {
    public static void main(String[] args) {

        int[] arr = {100, 10, 20, 32, 95, 97};
        System.out.println("The given array is:");
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
        //logic to find the second highest number
        // in the array
        int largest = 0;
        int secondLargest = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>largest) {
                secondLargest=largest;
                largest=arr[i];
            } else {
                secondLargest=arr[i];
            }
        }
        System.out.println("largest number of the array is: " + largest);
        System.out.println("largest second number of the array is: " + secondLargest);




    }
}


