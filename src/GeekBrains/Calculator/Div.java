package GeekBrains.Calculator;

import java.util.*;

public class Div implements Cmd {
    @Override
    public void operation(Stack<Double> stack, String[] cmd) {
        stack.push(stack.pop() / stack.pop());
    }
}
