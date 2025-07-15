import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class countingSort {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> freqList = new ArrayList<>(Collections.nCopies(100, 0));
        for (int i = 0; i < 100; i++) {
            freqList.set(i, (Collections.frequency(arr, i)));
        }

        return freqList;

    }

}
