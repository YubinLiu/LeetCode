public class SecondSolution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counters = new int[26];
        Arrays.fill(counters, 0);

        for (char c : s.toCharArray()) counters[c - 'a']++;
        for (char c : t.toCharArray()) counters[c - 'a']--;
        for (int i : counters)
            if (i != 0) return false;
        return true;
    }
}
