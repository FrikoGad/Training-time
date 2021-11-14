package EasyJava.Lesson4;

import static java.lang.Math.abs;

public class Person {
    private int lvl;
    private int cl;

    public Person(int newlvl, int newcl) {
        lvl = newlvl;
        cl = newcl;
    }

    public int getLvl() {
        return lvl;
    }

    public int getCl() {
        return cl;
    }

    public void characterClass(int cl) {
        switch (cl) {
            case 1:
                System.out.println("Выбран класс: Воин");
                break;
            case 2:
                System.out.println("Выбран класс: Маг");
                break;
            case 3:
                System.out.println("Выбран класс: Лучник");
                break;
            case 4:
                System.out.println("Выбран класс: Убийца");
                break;
            case 5:
                System.out.println("Выбран класс: Чернокнижник");
                break;
            case 6:
                System.out.println("Выбран класс: Шаман");
                break;
            case 7:
                System.out.println("Выбран класс: Паладин");
                break;
            case 8:
                System.out.println("Выбран класс: Скаут");
                break;
            case 9:
                System.out.println("Выбран класс: Лекарь");
                break;
            case 10:
                System.out.println("Выбран класс: Бард");
                break;
            default:
                System.out.println("Вы ввели некорректное значение класса. Введите значение от 1 до 10");
        }
    }

    public void reward(int lvl) {
        if (lvl % 5 == 0) {
            System.out.println("Вы получили награду");
        }
    }

    public void openTheDungeon(int lvlOne, int lvlTwo) {
        if (lvlOne < 10 && lvlTwo < 10 && abs(lvlOne - lvlTwo) > 3) {
            System.out.println("Подземелье закрыто! Проход доступен для персонажей с минимальным уровнем 10 и разницей между максимальным и минимальным уровнем не более 3.");
        } else {
            System.out.println("Добро пожаловать в подземелье");
        }
    }

    public void levelTolerance(int minLvl, int maxLvl, int lvl) {
        if (minLvl <= lvl && lvl <= maxLvl) {
            System.out.println("Ваш уровень позволяет войти в подземелье");
        } else {
            if (lvl < minLvl) {
                System.out.println("Ваш уровень слишком мал для входа в подземелье");
            } else {
                System.out.println("Ваш уровень слишком высок для входа в подземелье");
            }
        }
    }
    public void exp(int exp) {
        if (exp < 300) {
            for (int i = exp; i < 301; i++) {
                exp = i;
                System.out.println("exp = " + exp);
            }
            System.out.println("Вы достигли нового уровня");
        } else{
            System.out.println("exp = " + exp+1);
            System.out.println("У вас и так достаточно опыта");
        }
    }
}

