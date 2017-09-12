public class ThirdSolution {
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

            if (left != right) {
                if (left >= 97) {
                    if (left - 'a' != right - 'A') return false;
                } else if (left >= 65) {
                    if (left - 'A' != right - 'a') return false;
                } else return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public boolean notNumOrLetter(char c) {
        return (c < 48 || c > 57) && (c < 97 || c > 122) && (c < 65 || c > 90);
    }
}
