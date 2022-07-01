import java.util.Locale;
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

    }

    public static boolean lengthCheck(String password) {
        return (password.length() > 7);
    }

    public static boolean containsNumberCheck(String password) {
        boolean check = false;
        for (int i = 0; i < 10; i++) {
            if (password.contains("" + i)) {
                check = true;
            }
            if (check) break;
        }
        return check;
    }

    public static boolean containsCapitalCheck(String password) {
        boolean checkUpper = false;
        boolean checkLower = false;
        int lengthPassword = password.length();
        for (int i = 0; i < lengthPassword; i++) {
            char x = password.charAt(i);
            if (Character.isUpperCase(x)) {
                checkUpper = true;
            } else if (Character.isLowerCase(x)) {
                checkLower = true;
            }
            if (checkUpper && checkLower) break;
        }
        return checkUpper && checkLower;
    }

    public static boolean isGood(String password) {
        boolean isGood = true;
        String[] badPasswordsList = {"qwerty", "qwertz", "123", "password", "passwort", "456", "1q2w3e", "111", "aaa",
                "abc" };
        int badPaswordsListLength = badPasswordsList.length;
        for (int i = 0; i < badPaswordsListLength; i++) {
            if (password.toLowerCase().contains(badPasswordsList[i])) {
                isGood = false;
            }
        }
        return isGood;
    }


}
