package EasyJava.Lesson6;

public class Triangle {
    public void fourTriangle(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j<i && i+j < matrix.length - 1) matrix[i][j] = 1; //левый треугольник
                if(i< matrix.length/2 && j>i && i+j < matrix.length - 1) matrix[i][j] = 2; //верхний треугольник
                if(i> matrix.length/2 && j<i && i+j > matrix.length - 1) matrix[i][j] = 3; //нижний треугольник
                if(j>i && i+j > matrix.length - 1) matrix[i][j] = 4; //правый треугольник
            }
        }
        printArray(matrix);
    }
    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
