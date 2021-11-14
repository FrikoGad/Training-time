package EasyJava.Lesson6;

public class Phrase {
    private String st;

    public Phrase(String newst) {
        st = newst;
    }

    public void openDoor(String st) {
        boolean f = true;
        st =  st.toLowerCase();
        st = st.replace(" ","");
        for (int i = 0; i < (st.length() / 2) + 1; i++) {
            if (st.charAt(i) != st.charAt(st.length() - 1 - i)) {
                f = false;
                break;
            }
        }
        if (f == true){
            System.out.println("Дверь открывается.Проходите:3");
        }else {
            System.out.println("Вы сказали фразу, не являющуюся палиндромом, попробуйте еще раз.");
        }
    }
}