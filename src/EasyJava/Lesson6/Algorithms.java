package EasyJava.Lesson6;

public class Algorithms {
    public static void main(String[] args) {
        String st = "А роза упала на лапу Азора";
        Phrase phrase = new Phrase(st);
        phrase.openDoor(st);
        Chess chess = new Chess();
        chess.placeRocks();
        int[][] matrix = new int[15][15];
        Triangle triangle = new Triangle();
        triangle.fourTriangle(matrix);
    }
}
