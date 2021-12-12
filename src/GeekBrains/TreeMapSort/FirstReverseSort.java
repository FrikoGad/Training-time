package GeekBrains.TreeMapSort;
import java.util.*;

public class FirstReverseSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 75, 3, 84, 1, 1, 4, 5, 5, 5, 55, 55, 42, 6, 2, 3};
        Map<Integer, Integer> cnt = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (!cnt.containsKey(key)) {
                cnt.put(key, 1);
            } else {
                int cntValue = cnt.get(key);
                cnt.put(key, cntValue + 1);
            }
        }
        for (Integer key : cnt.keySet()) {
            for (int n = 0; n < cnt.get(key); n++) {
                System.out.println(key);
            }
        }
        System.out.println(cnt);
    }
}
