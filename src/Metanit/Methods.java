package Metanit;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
// Задание 1: Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.
// Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа для сравнения");
        int c = 0;
        int d = 0;
        int f = 0;
        c = sc.nextInt();
        d = sc.nextInt();
        f = comparison(c, d);
        System.out.println("Меньшее число = " + f);
// Задание 2: Напишите метод, который бы проверял, делится ли число на 2 без остатка или нет.
        divisionByTwo(c);
// Задание 3: Написать метод возведения числа в квадрат.
        square(c);
// Задание 4: Напишите метод, который бы возвращал в консоль:
// true, если число больше 5
// и false, если число меньше 5
        System.out.println(trueFalse(c));
    }

    public static int comparison(int a, int b) {

        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static void divisionByTwo(int p) {
        int q = p % 2;
        if (q == 0) {
            System.out.println("Число " + p + " делится на 2 без остатка");
        } else {
            System.out.println("Число " + p + " не делится на 2 без остатка");
        }
    }

    public static int square(int e) {
        int d = e * e;
        return d;
    }

    public static boolean trueFalse(int a) {
        boolean g;
        if (a < 5) {
            g = true;
            return g;
        } else {
            g = false;
            return g;
        }
    }
}
