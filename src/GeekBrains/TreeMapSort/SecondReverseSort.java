package GeekBrains.TreeMapSort;

import java.util.*;

public class SecondReverseSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 55, 3, 66, 85, 36, 42, 8, 23, 7, 55, 85, 55, 85, 55, 9};

        TreeMap<Integer, Integer> map;

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;
            }
        };
        map = new TreeMap<Integer, Integer>(comparator);

        for (int keys : arr) {
            Integer integerValue = map.get(keys);
            if (integerValue == null) {
                map.put(keys, 1);
            } else {
                map.put(keys, integerValue + 1);
            }
        }
        for (int keys : map.keySet()) {
            int value = map.get(keys);
            for (int i = 0; i < value; i++) {
                System.out.println(keys);
            }
        }
    }
}
