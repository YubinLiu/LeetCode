import java.util.Stack;
import java.util.TreeMap;
public class FirstMinStack {

    Stack<Integer> stack = new Stack<>();
    TreeMap<Integer, Integer> map = new TreeMap<>();

    /** initialize your data structure here. */
    public FirstMinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if (!map.containsKey(x)) map.put(x, 1);
        else map.put(x, map.get(x) + 1);
    }

    public void pop() {
        int val = stack.pop();
        int count = map.get(val) - 1;
        if (count > 0) map.put(val, count);
        else map.remove(val);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return map.firstKey();
    }
}
