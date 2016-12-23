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


}
