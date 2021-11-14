package EasyJava.Lesson6;

public class Chess {
    public void placeRocks() {
        int n = 4;
        int count = 0;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] line0 = new int[n];
            line0[i] = 1;
            array[0] = line0;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    int[] line1 = new int[n];
                    line1[j] = 2;
                    array[1] = line1;
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j) {
                            count++;
                            int[] line2 = new int[n];
                            line2[k] = 3;
                            array[2] = line2;
                            for (int l = 0; l < n; l++) {
                                if (l != i && l != j && l != k) {
                                    int[] line3 = new int[n];
                                    line3[l] = 4;
                                    array[3] = line3;
                                }
                            }
                            for (int m = 0; m < n; m++) {
                                for (int o = 0; o < n; o++) {
                                    System.out.print(array[m][o] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}

