public class SecondSolution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0 || s.isEmpty() || s.length() % 2 != 0) {
            return false;
        }

        char[] c = new char[s.length()];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isLeftParentheses(s.charAt(i))) c[j++] = ch;
            else if (j > 0 && ch == ')' && c[--j] == '(') continue;
            else if (j > 0 && ch == ']' && c[--j] == '[') continue;
            else if (j > 0 && ch == '}' && c[--j] == '{') continue;
            else return false;
        }

        if (j == 0) return true;

        return false;
    }

    public boolean isLeftParentheses(char c) {
        if (c == '{' || c == '(' || c == '[') {
            return true;
        }
        return false;
    }
}
