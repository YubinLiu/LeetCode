import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class FirstSolution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isLeftParentheses(s.charAt(i))) left++;
            else right++;
        }

        if (left != right) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isLeftParentheses(c)) stack.push(c);
            else {
                if (stack.size() == 0 || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isLeftParentheses(char c) {
        if (c == '{' || c == '(' || c == '[') {
            return true;
        }
        return false;
    }
}
