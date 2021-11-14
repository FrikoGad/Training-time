package EasyJava.Lesson4;

public class OperatorsOfChoice {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру. Выберите персонажа.");
        Person person1 = new Person(8, 4);
        Person person2 = new Person(20, 7);
        person1.characterClass(person1.getCl());
        person2.characterClass(person2.getCl());
        person1.reward(person1.getLvl());
        person2.reward(person2.getLvl());
        person1.openTheDungeon(person1.getLvl(),person2.getLvl());
        person1.levelTolerance(10,20, person1.getLvl());
        person2.levelTolerance(10,25,person2.getLvl());
    }
}
