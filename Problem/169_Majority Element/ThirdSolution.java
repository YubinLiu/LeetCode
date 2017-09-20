public class ThirdSolution {
    public int majorityElement(int[] nums) {
        int major = 0;
        int counter = 0;
        for (int i : nums) {
            if (counter == 0) major = i;
            if (major != i) counter--;
            else counter++;
        }
        return major;
    }
}
