public class FirstSolution {
    public int lengthOfLastWord(String s) {
        if (s.split(" ").length == 0) return 0;
        String[] strs = s.split(" ");
        return strs[strs.length - 1].length();
    }
}
