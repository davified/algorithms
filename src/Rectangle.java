import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Rectangle {
    public static List<Integer> solution(int l, int w) {
        int length = Math.max(l, w);
        int width = Math.min(l, w);
        ArrayList<Integer> outputArray = new ArrayList<>();

        if (length == width) {
            outputArray.add(length);
        } else {
            outputArray.add(width);
            int remainder = length - width;
            outputArray.addAll(solution(remainder, width));
        }
        return outputArray;
    }

   public static List<Integer> sqInRect(int input1, int input2) {
        if (input1 == input2){
            return null;
        } else {
            return solution(input1, input2);
        }
   }
}
