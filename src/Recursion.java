/**
 * Created by davidtan on 21/12/2016.
 */
public class Recursion {
    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n-1);
        } else {
            return 1;
        }
    }

    public static boolean isPalindrome(String str) {
//        boolean output = false;
        if (str.length() < 2) {
            return true;
        } else {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                String substr = str.substring(1, str.length() - 1);
                return true && isPalindrome(substr);

            } else {
                return false;
            }
        }
//        return output;

    }
}
