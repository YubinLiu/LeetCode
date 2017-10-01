public class ThirdSolution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int length = s.length();
        char[] sChar = new char[256];
        char[] tChar = new char[256];

        for (int i = 0; i < length; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (sChar[sc] == 0 && tChar[tc] == 0) {
                sChar[sc] = tc;
                tChar[tc] = sc;
            } else {
                if (sChar[sc] != tc || tChar[tc] != sc) return false;
            }
        }

        return true;
    }
}
