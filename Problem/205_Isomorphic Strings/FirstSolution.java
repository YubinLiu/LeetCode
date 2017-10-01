import java.util.Map;
import java.util.HashMap;
public class FirstSolution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int length = s.length();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (map.containsKey(sChar)) {
                if (map.get(sChar) == tChar) continue;
                else return false;
            } else {
                if (!map.containsValue(tChar)) map.put(sChar, tChar);
                else return false;
            }
        }

        return true;
    }
}
