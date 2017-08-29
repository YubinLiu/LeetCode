public class FirstSolution {
    public int reverse(int x) {
        int n = Math.abs(x);
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = c.length - 1; i >= 0; i--) {
            sb.append(c[i]);
        }

        try {
            return x > 0 ? Integer.parseInt(sb.toString()) : 0 - Integer.parseInt(sb.toString());
        } catch(NumberFormatException e) {
            return 0;
        }
    }
}
