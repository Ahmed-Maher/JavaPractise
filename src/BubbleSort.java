class BubbleSort {

    public static void main(String[] args) {
        int[] a = {3,2,1};
        int swap = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a [j+1];
                    a[j+1] = temp;
                    swap++;
                }
            }
        }
        System.out.println("Array is sorted in "+ swap + " swaps");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }

}
