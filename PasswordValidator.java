package Methods;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (passLenghtValidation(password) && isConsistOnlyLetherAndDigits(password)
         && haseAtliest2Digits(password)){
            System.out.println("Password is valid");
        }
        if (!passLenghtValidation(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isConsistOnlyLetherAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!haseAtliest2Digits(password)){
            System.out.println("Password must have at least 2 digits");
        }
    }
    public static boolean passLenghtValidation(String pass){
        return pass.length() >=6 && pass.length() <= 10;

    }

    public static boolean isConsistOnlyLetherAndDigits(String pass){
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.toLowerCase().charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)){
                return false;
            }
            
        }
        return true;

    }

    public static boolean haseAtliest2Digits(String pass){
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
            if ((symbol >= 48 && symbol <= 57)){
                count++;
            }

        }
        return count >= 2;

    }
}
