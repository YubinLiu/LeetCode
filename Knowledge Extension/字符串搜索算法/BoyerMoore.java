public class BoyerMoore {
   public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int charTable[] = makeCharTable(needle);
        int offsetTable[] = makeOffsetTable(needle);
        for (int i = needle.length() - 1, j; i < haystack.length();) {
            for (j = needle.length() - 1; needle.charAt(j) == haystack.charAt(i); --i, --j) {
                if (j == 0) {
                    return i;
                }
            }
            i += Math.max(offsetTable[needle.length() - 1 - j], charTable[haystack.charAt(i)]);
        }
        return -1;
    }

    private int[] makeCharTable(String needle) {
        int[] table = new int[256];
        for (int i = 0; i < table.length; ++i) {
            table[i] = needle.length();
        }
        for (int i = 0; i < needle.length() - 1; ++i) {
            table[needle.charAt(i)] = needle.length() - 1 - i;
        }
        return table;
    }

    private int[] makeOffsetTable(String needle) {
        int[] table = new int[needle.length()];
        int lastPrefixPosition = needle.length();
        for (int i = needle.length(); i > 0; --i) {
            if (isPrefix(needle, i)) {
                lastPrefixPosition = i;
            }
            table[needle.length() - i] = lastPrefixPosition - i + needle.length();
        }
        for (int i = 0; i < needle.length() - 1; ++i) {
            int slen = suffixLength(needle, i);
            table[slen] = needle.length() - 1 - i + slen;
        }
        return table;
    }

    private boolean isPrefix(String needle, int p) {
        for (int i = p, j = 0; i < needle.length(); ++i, ++j) {
            if (needle.charAt(i) != needle.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private int suffixLength(String needle, int p) {
        int len = 0;
        for (int i = p, j = needle.length() - 1; i >= 0 && needle.charAt(i) == needle.charAt(j); --i, --j) {
            len += 1;
        }
        return len;
    }
}
