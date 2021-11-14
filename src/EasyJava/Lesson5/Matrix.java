package EasyJava.Lesson5;

public class Matrix {
    public void matrix (){
        int [][] matrixA = new int [5][5];
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 5; j++){
                int num = (i+1)*(j+1);
                matrixA[i][j] = num;
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
