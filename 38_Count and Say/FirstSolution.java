public class FirstSolution {
    public String countAndSay(int n) {
        String result = "1";
        int i = 1;
        while (i < n) {
             result = countOnce(result);
             i++;
        }

        return result;
    }

    public String countOnce(String result) {
        char c = result.charAt(0);
        int num = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < result.length(); i++) {
            if (result.charAt(i) == c) {
                num++;
                continue;
            }
            sb.append(String.valueOf(num) + c);
            c = result.charAt(i);
            num = 1;
        }
        sb.append(String.valueOf(num) + c);
        return sb.toString();
    }
}
