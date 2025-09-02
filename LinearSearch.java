import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);

        int[] a = { 4, 1, 3, 6, 5 };

        System.out.println("Enter your target value.");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("Target found at index : " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
