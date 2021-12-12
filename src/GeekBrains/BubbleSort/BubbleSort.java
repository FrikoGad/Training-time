package GeekBrains.BubbleSort;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,1,75,3,84,55,42,6,2,3};
        int i = 0;
        int f = 0;
        while (true){
            if (arr[i] > arr[i+1]){
                arr[i] = arr[i] + arr[i+1];
                arr[i+1] = arr[i] - arr[i+1];
                arr[i] = arr[i] - arr[i+1];
                f = 0;
            } else {
                f++;
            }
            i++;
            if (i == arr.length-1){
                i = 0;
            }
            if (f == arr.length-1){
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
