package ConsoleApplication;
// Сайт https://www.4stud.info/java-programming/creating-console-application.html
// Задание 2: ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания их длин, а также (второй приоритет) значений этих их длин.

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondQuest {
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
//сортировка массива строк по возрастающей длине
        for ( int i = 0; i < str. length -1; i++)
        {
            for (int j = i+1; j < str.length; j++)
            {
                if (str[i].length()>str[j].length())
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        int minlength = str[0].length();
        System.out.println("Строки в порядке возрастания длины: ");
        for ( int i = 0; i < str. length ; i++)
        {
            System.out.print(str[i]);
            for (int j = 0; j < minlength - str[i].length(); j++)
                System.out.print(" ");
            System. out.println( " её длина = " + str[i].length());
        }
    }
}