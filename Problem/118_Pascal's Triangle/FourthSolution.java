import java.util.Arrays;
public class FourthSolution {
    public List<List<Integer>> generate(int numRows) {
        int[][] array = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            array[i] = new int[i + 1];
            array[i][0] = array[i][i] = 1;
            if (i == 0)
                continue;
            for (int j = 1; j <= i / 2; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
            for (int j = i - 1; j > i / 2; j--) {
                array[i][j] = array[i][i - j];
            }
        }
        return (List) Arrays.asList(array);
    }
}
