package EasyJava.Lesson5;

public class YearOfBirth {
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public YearOfBirth(int[] newarray) {
        array = newarray;
    }

    public int[] sample(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    public void viewArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("}");
    }
}
