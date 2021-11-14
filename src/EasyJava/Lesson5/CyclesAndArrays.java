package EasyJava.Lesson5;

import EasyJava.Lesson4.Person;

public class CyclesAndArrays {
    public static void main(String[] args) {
        int[] array = {1976, 1989, 1965, 1990, 1988, 1995, 1993};
        YearOfBirth yearOfBirth = new YearOfBirth(array);
        yearOfBirth.viewArray(array);
        yearOfBirth.sample(array);
        yearOfBirth.viewArray(array);
        int[] chest = {12, 200, 14, 76, 197, 3, 201};
        Box box = new Box(chest);
        System.out.println("");
        box.sort(chest);
        Matrix matrix = new Matrix();
        matrix.matrix();
        Person person = new Person(350,4);
        int exp = person.getLvl();
        person.exp(exp);
    }
}
