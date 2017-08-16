import java.util.Map;
import java.util.HashMap;

public class FirstSolution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        initMap(map);
        int sum = map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (map.get(s.charAt(i - 1)) < map.get(s.charAt(i))) {
                sum += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            }
            else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public void initMap(Map<Character, Integer> map) {
        map.put('I', 1);
        map.put('X', 10);
        map.put('C', 100);
        map.put('M', 1000);
        map.put('V', 5);
        map.put('L', 50);
        map.put('D', 500);
    }
}
