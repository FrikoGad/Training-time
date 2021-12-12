package GeekBrains.Calculator;

import java.util.*;

public class Mul implements Cmd {
    @Override
    public void operation(Stack<Double> stack, String[] cmd) {
        stack.push(stack.pop() * stack.pop());
    }
}
