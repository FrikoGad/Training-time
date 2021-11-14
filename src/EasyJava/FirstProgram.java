package EasyJava;

public class FirstProgram {
    public static void main(String[] args) {
        int exp = 5000;
        lvlOutput(calculateLvl(exp));
    }

    public static int calculateLvl(int exp) {
        return exp / 1000;
    }

    public static void lvlOutput(int exp) {
        System.out.println("Уровень персонажа - " + exp + "!");
    }
}
