package accenture;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = checkIt(str);
        if(i==1)
            System.out.println("valid");
        else
            System.out.println("Invalid");
    }

    private static int checkIt(String str) {

        String length = ".{4,}";
        String digit = ".*\\d.*";
        String upperCase = ".*[A-Z].*";
        String lowerCase = ".*[a-z].*";
        String slashChar = "^[^\\s]+$";
        String spaceChar = "^[^/]+$";

        if(str.matches(length) && str.matches(digit) && str.matches(upperCase) && str.matches(lowerCase) && str.matches(slashChar) && str.matches(spaceChar))
            return 1;
        else
            return 0;

    }
}
