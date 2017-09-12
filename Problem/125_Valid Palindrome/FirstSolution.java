public class FirstSolution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        for (int i = 0, j = s.length() - 1; i < s.length() / 2 && j >= s.length() / 2; ) {
            char left = s.charAt(i);
            if (!isNumOrLetter(left)) {
                i++;
                continue;
            }
            char right = s.charAt(j);
            if (!isNumOrLetter(right)) {
                j--;
                continue;
            }

            String strLeft = String.valueOf(left);
            String strRight = String.valueOf(right);
            if (!strLeft.equalsIgnoreCase(strRight)) return false;
            i++;
            j--;
        }

        return true;
    }

    public boolean isNumOrLetter(char c) {
        String s = String.valueOf(c);
        return s.matches("[a-zA-Z]") || s.matches("[0-9]");
    }
}
