public class SecondSolution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (notNumOrLetter(left)) {
                i++;
                continue;
            }
            if (notNumOrLetter(right)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) return false;
            i++;
            j--;
        }

        return true;
    }

    public boolean notNumOrLetter(char c) {
        return (c < 48 || c > 57) && (c < 97 || c > 122) && (c < 65 || c > 90);
    }
}
