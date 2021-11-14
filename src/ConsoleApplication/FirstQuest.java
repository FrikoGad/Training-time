package ConsoleApplication;
// Сайт https://www.4stud.info/java-programming/creating-console-application.html
// Задание 1: ввести n строк с консоли, найти самую короткую строку. Вывести эту строку и ее длину.

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstQuest {
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
        String[] str2 = new String[1];
        int p = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(" Введите строку №" + (i + 1));
            str[i] = two.nextLine();
            if (i == 0) {
                p = str[i].length();
                System.arraycopy(str,i,str2,0,1);
            } else {
                if (str[i].length() < p) {
                    p = str[i].length();
                    System.arraycopy(str,i,str2,0,1);
                } else {
                }
            }
        }
        System.out.println("Самая маленькая строка " + Arrays.toString(str2));
        System.out.println("Длина этой строки " + p);
    }
}