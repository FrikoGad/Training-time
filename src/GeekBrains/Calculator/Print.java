package GeekBrains.Calculator;

import java.util.*;

public class Print implements Cmd {
    @Override
    public void operation(Stack<Double> stack, String[] cmd){
        System.out.println(stack);
    }
}