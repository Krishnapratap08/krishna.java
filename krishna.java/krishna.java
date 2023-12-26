
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

    public static void main(String[] args) {
        // Create an array of values
        Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convert array to list
        List<Integer> list = Arrays.asList(values);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert list back to array (optional)
        list.toArray(values);

        // Print the shuffled array
        System.out.println(Arrays.toString(values));
    }
}