public class SecondSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) return "";
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(result)) result = result.substring(0, result.length() - 1);
        }
        return result;
    }
}
