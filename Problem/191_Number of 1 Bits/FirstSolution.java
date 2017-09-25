public class FirstSolution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') result++;
        }
        return result;
    }
}
