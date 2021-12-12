package GeekBrains.CountingWords;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CountingWords {
    public static void main(String[] args) {
        String st = "Ленин всегда живой, Ленин всегда со мной.";
        countingWords(st);

    }

    private static void countingWords(String st) {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i1 - i2;
            }
        };
        Map<String, Integer> map = new TreeMap<String, Integer>();
        String[] words = st.replaceAll("[^А-Яа-я ]", "").toLowerCase().split("\\s+");
        for (String key : words) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                int keyValue = map.get(key);
                map.put(key, keyValue + 1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}