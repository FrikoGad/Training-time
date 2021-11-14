package Metanit;

import java.util.Scanner;

public class Сycles {
    public static void main(String[] args) {
// Задание 1: В стране XYZ население равно 10 миллионов человек.
// Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
// Рассчитайте, какая численность населения будет через 10 лет,
// принимая во внимание, что показатели рождаемости и смертности постоянны.
        System.out.println("Задание 1.");
        int population = 10000000;
        int fertility = 14;
        int mortality = 8;
        for (int i = 0; i < 10; i++) {
            population += population * (fertility - mortality)/ 1000;
        }
        System.out.println(population);
// Задание 2: В стране XYZ население равно 10 миллионов человек.
// Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
// Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год.
// Рассчитайте, какая численность населения будет через 10 лет,
// учитывая, что рождаемость не может быть меньше 7 человек на 1000 человек,
// а смертность не может быть меньше 6 человек на 1000 человек.
        System.out.println("Задание 2.");
        for(int i = 1; i <= 10; i++){
            if (fertility > 7) fertility -= 1;
            if  (mortality > 6) mortality -=1;
            population += population * (fertility - mortality) / 1000;
        }
        System.out.println(population);
// Задание 3: За каждый месяц банк начисляет к сумме вклада 7% от суммы.
// Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
// А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
// Для вычисления суммы с учетом процентов используйте цикл for.
// Пусть сумма вклада будет представлять тип float.
        System.out.println("Задание 3.");
        float n = 0;
        int p = 0;
        System.out.println("Введите сумму вклада:");
        Scanner one = new Scanner(System.in);
        n = one.nextFloat();
        System.out.println("Введите срок вклада в месяцах:");
        p = one.nextInt();
        for (int i = 0; i < p; i++){
            n += n * 0.07;
        }
        System.out.println("После " + p + " месяцев сумма вклада составит " + n);
// Задание 4: Перепишите предыдущую программу,
// только вместо цикла for используйте цикл while.
        System.out.println("Задание 4.");
        System.out.println("Введите сумму вклада:");
        Scanner two = new Scanner(System.in);
        n = two.nextFloat();
        System.out.println("Введите срок вклада в месяцах:");
        p = two.nextInt();
        int i =0;
        while (i < p){
            n += n * 0.07;
            i++;
        }
        System.out.println("После " + p + " месяцев сумма вклада составит " + n);
// Задание 5: Напишите программу, которая выводит на консоль таблицу умножения.
        System.out.println("Задание 5.");
        for (i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
// Задание 6: В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.
// После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
// И если пользователь введет число 1, то программа завершает цикл.
// Если введено любое другое число, то программа продолжает спрашивать у пользователя два числа и умножать их.
        System.out.println("Задание 6.");
        int q = 1, t = 0, f = 0, r = 0;
        while (q > 0){
            System.out.println("Введите два числа");
            Scanner three = new Scanner(System.in);
            t = three.nextInt();
            f = three.nextInt();
            System.out.println("Результат умножения чисел = " + t * f);
            System.out.println("Надо ли завершить выполнение?");
            r = three.nextInt();
            if (r == 1){
                break;
            }
        }
    }
}



