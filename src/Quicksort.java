import java.util.Arrays;

/**
 * Created by davidtan on 21/12/2016.
 */
public class Quicksort {
    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }
    public static int[] quicksort(int[] array, int p, int r) {


//        partition(array, p, partition(array, p, r)-1);
        if ( p < r ) {
            int q = partition(array, p, r);
            quicksort(array, p, q - 1);
            quicksort(array, q + 1, r);
        }
        return array;
    }

    public static int partition(int[] array, int p, int r) {
//        int[] original = new int[]{9, 7, 5, 11, 12, 2, 14, 3, 10, 4, 6};

        // Compare array[j] with array[r], for j = p, p+1,...r-1
        // maintaining that:
        //  array[p..q-1] are values known to be <= to array[r]
        //  array[q..j-1] are values known to be > array[r]
        //  array[j..r-1] haven't been compared with array[r]
        // If array[j] > array[r], just increment j.
        // If array[j] <= array[r], swap array[j] with array[q],
        //   increment q, and increment j.
        // Once all elements in array[p..r-1]
        //  have been compared with array[r],
        //  swap array[r] with array[q], and return q.
        int q = p;
        System.out.println("calling partition() on " + Arrays.toString(array));
        for (int j = p; j < r  ; j++) {
            if (array[j] > array[r]) {

            } else if (array[j] <= array[r]) {
                swap(array, j, q);

                q++;
            }
        }
        swap(array, q, r);
        return q;
    }
}
//    int[] expected = new int[]{5, 2, 3, 4, 6, 7, 14, 9, 10, 11, 12};
