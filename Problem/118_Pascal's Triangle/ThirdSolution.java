import java.util.List;
import java.util.Arrays;

public class ThirdSolution {
    public List<List<Integer>> generate(int numRows) {
        int[][] array = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            array[i] = new int[i + 1];
            array[i][0] = array[i][i] = 1;
            if (i == 0) continue;
            for (int j = 1; j < i; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }
        return (List) Arrays.asList(array);
    }
}
