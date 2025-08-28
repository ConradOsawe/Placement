import java.util.Scanner;

public class Main {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        String password = sc.nextLine();

        int conditions = 0;

        // Condition 1: length >= 8
        if (password.length() >= 8) {
            conditions++;
        }

        // Condition 2: At least one uppercase
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        if (hasUpper)
            conditions++;
        if (hasLower)
            conditions++;
        if (hasDigit)
            conditions++;
        if (hasSpecial)
            conditions++;

        if (conditions == 5) {
            System.out.println("Strong password");
        } else if (conditions == 3) {
            System.out.println("Moderate passsword");
        } else {
            System.out.println("Password is weak");
        }
        sc.close();
    }
}
