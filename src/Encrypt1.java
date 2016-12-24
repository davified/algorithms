import java.util.Arrays;

/**
 * Created by davidtan on 23/12/2016.
 */
public class Encrypt1 {
    public static String encrypt(String input, int numberOfEncryptionCycles) {
        StringBuilder output =  new StringBuilder();

        helper(input, output, 1);
        helper(input, output, 0);


        if (input == null && input.isEmpty()) {
            return null;
        }
        else if (numberOfEncryptionCycles <= 0) {
            return input;
        } else if (numberOfEncryptionCycles == 1) {
            return output.toString();
        } else {
            while (numberOfEncryptionCycles > 1){
                numberOfEncryptionCycles--;
                return encrypt(output.toString(), numberOfEncryptionCycles);
            }
        }
        return output.toString();
    }

    private static void helper(String input, StringBuilder output, int startingIndex) {
        for (int i = startingIndex; i < input.length(); i+=2) {
            output.append(input.charAt(i));
        }
    }


    public static String decrypt(String input, int numberOfDecryptionCycles) {

        //create a fixed sized array from input length
        char[] charArray = new char[input.length()];

        //save first half of string into odd indexes in the the char array
        for (int i = 0; i < input.length()/2; i++) {
            charArray[i*2+1] = input.charAt(i);
        }

        //save second half of string into even indexes in the the char array
        int j = input.length()/2; // 7
        for (int i = 0; i < input.length(); i+=2) {
            charArray[i] = input.charAt(j + i/2);
        }

        if (input == null && input.isEmpty()) {
            return null;
        }
        else if (numberOfDecryptionCycles <= 0) {
            return input;
        } else if (numberOfDecryptionCycles == 1) {
            String output = new String(charArray);
            return output;
        } else {
            while (numberOfDecryptionCycles > 1){
                numberOfDecryptionCycles--;
                return decrypt(new String(charArray), numberOfDecryptionCycles);
            }
        }

        return new String(charArray);
    }
}
