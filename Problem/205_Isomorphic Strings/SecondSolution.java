public class SecondSolution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int length = s.length();
        int[] sChar = new int[256];
        int[] tChar = new int[256];
        for (int i = 0; i < length; i++) {
            if (sChar[s.charAt(i)] != tChar[t.charAt(i)]) return false;
            sChar[s.charAt(i)] = i + 1;
            tChar[t.charAt(i)] = i + 1;
        }

        return true;
    }
}
