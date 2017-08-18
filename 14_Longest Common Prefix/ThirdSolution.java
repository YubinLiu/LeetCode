public class ThirdSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) return "";
        if (strs.length == 1) return strs[0];
        String result = strs[0].length() < strs[1].length() ? strs[0] : strs[1];

        for (int i = 0; i < result.length(); i++) {
            if (strs[0].charAt(i) != strs[1].charAt(i)) {
                result = strs[1].substring(0, i);
                break;
            }
        }

        if (strs.length == 2) return result;

        for (int i = 2; i < strs.length; i++) {
            while (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
                if (result == "") {
                    return "";
                }
            }
        }

        return result;
    }
}
