package GeekBrains.Calculator;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<Double>();
        Scanner scan = new Scanner(System.in);

        Map<String, Cmd> setOfOperation = new HashMap<String,Cmd>();

        setOfOperation.put("PUSH", new Push());
        setOfOperation.put("PRINT", new Print());
        setOfOperation.put("ADD", new Add());
        setOfOperation.put("DIV", new Div());
        setOfOperation.put("MUL", new Mul());
        setOfOperation.put("SUB", new Sub());
        setOfOperation.put("DEFINE", new Define());

        while (true) {
            String comand = scan.nextLine();
            String[] parts = comand.split(" ");
            String comandName = parts[0].toUpperCase();
            setOfOperation.get(comandName).operation(stack, parts);


        }
    }
}
