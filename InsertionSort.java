import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 1, 2, 5, 4 };

        System.out.println("Before sorting :" + Arrays.toString(arr));

        // Insertion sort

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("After sorting :" + Arrays.toString(arr));
    }
}
