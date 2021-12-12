package GeekBrains.Calculator;

import java.util.*;

public class Push implements Cmd{
    public void operation(Stack<Double> stack, String[] cmd){
        stack.push(Double.valueOf(cmd[1]));
    }
}