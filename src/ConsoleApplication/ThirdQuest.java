package ConsoleApplication;
// Сайт https://www.4stud.info/java-programming/creating-console-application.html
// Задание 3: ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, также их длины.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class ThirdQuest {
    public static void main(String[] args) {
        int n = 0;
        while (true) // ввод числа строк
        {
            System.out.println("Введите число строк");
            Scanner one = new Scanner(System.in);
            try {
                n = one.nextInt();
                break;
            } catch (InputMismatchException fg) {
// если введенное значение не является числом
                System.out.print("Вы ввели не число. ");
            }
        }
// создание массива строк
        String[] str = new String[n];
        Scanner two = new Scanner(System.in);
        int p = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(" Введите строку №" + (i + 1));
            str[i] = two.nextLine();
        }
        int average = 0;
        int sum = 0;
        ArrayList<String> finish = new ArrayList<>();
        for (int j = 0; j < str.length; j++) {
            sum += str[j].length();
        }
        average = sum / str.length;
        for (int i = 0; i < n; i++) {
            if (str[i].length() < average) {
                finish.add(str[i]);
            }
        }
        System.out.println("Среднее значение длин строк = " + average);
        finish.forEach((fin) -> System.out.println("Строка - " + fin + " Длина этой строки = " + fin.length()));
    }
}