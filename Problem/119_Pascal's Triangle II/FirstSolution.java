import java.util.List;
import java.util.ArrayList;

public class FirstSolution {
    public List<Integer> getRow(int rowIndex) {
        int[][] array = new int[rowIndex + 1][];
        for (int i = 0; i <= rowIndex; i++) {
            array[i] = new int[i + 1];
            array[i][0] = array[i][i] = 1;
            if (i == 0) continue;
            for (int j = 1; j < i; j++) {
                array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int num : array[rowIndex]) {
            list.add(num);
        }
        return list;
    }
}
