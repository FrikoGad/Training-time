package GeekBrains.Calculator;

import java.util.Stack;

public interface Cmd {
    public void operation(Stack<Double> stack, String[] cmd);
}
