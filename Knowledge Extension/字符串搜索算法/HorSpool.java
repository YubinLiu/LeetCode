import java.util.Arrays;

public class HorSpool {
   public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;

        int[] preprocess = new int[256];
        Arrays.fill(preprocess, needle.length());

        for (int i = 0; i != needle.length() - 1; i++) {
            preprocess[needle.charAt(i)] = needle.length() - 1 - i;
        }

        int j = 0;
        char c;

        while (j <= haystack.length() - needle.length()) {
            c = haystack.charAt(j + needle.length() - 1);
            if (needle.charAt(needle.length() - 1) == c
                    && needle.substring(0, needle.length() - 1).equals(haystack.substring(j, j + needle.length() - 1))) {
                return j;
            }
            j += preprocess[c];
        }

        return -1;
    }
}
