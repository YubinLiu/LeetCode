public class FirstSolution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > target) break;
            int z = containsNum(numbers, i, target - numbers[i]);
            if (z != -1) return new int[] {i + 1, z + 1};
        }
        return null;
    }

    public int containsNum(int[] numbers, int i, int difference) {
        for (int x = i + 1; x < numbers.length; x++) {
            if (numbers[x] > difference) break;
            if (numbers[x] == difference) return x;
        }
        return -1;
    }
}
