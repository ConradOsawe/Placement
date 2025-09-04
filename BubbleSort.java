import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] s) {
        int[] a = { 4, 6, 2, 5, 1, 3 };

        // System.ut.oprintln("Before sorting :");
        // for (int i = 0; i<a.lenght; i++);
        // System.out.print(" " + a[i]);

        System.out.println("Before sorting:" + Arrays.toString(a));

        for (int i = 0; i < a.length - 1; i++) { // outer loop
            for (int j = 0; j < a.length - 1 - i; j++) { // inner loop
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }

        }

    }
}
