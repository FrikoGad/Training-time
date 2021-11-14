package EasyJava.Lesson5;

public class Box {
    private int[] array;

    public Box(int[] newArray) {
        array = newArray;
    }

    public void sort(int[] array) {
        int[] ex = new int[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
            }
        }
        System.out.println("Самая маленькая награда: " + array[0] + " Самая большая награда: " + array[array.length - 1]);
    }

    public void swap(int[] array, int x, int y) {
        int a = array[x];
        array[x] = array[y];
        array[y] = a;
    }
}
