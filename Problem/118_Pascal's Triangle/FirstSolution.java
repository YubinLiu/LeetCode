import java.util.List;
import java.util.ArrayList;

public class FirstSolution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows >= 1) {
            List<Integer> temp = new ArrayList<>(1);
            temp.add(1);
            result.add(temp);
        }
        if (numRows >= 2) {
            List<Integer> temp = new ArrayList<>(2);
            temp.add(1);
            temp.add(1);
            result.add(temp);
        }

        int size = 2;

        while (size < numRows) {
            List<Integer> temp = new ArrayList<>(size);
            temp.add(1);
            for (int i = 0; i < size - 1; i++) {
                int x = result.get(size - 1).get(i);
                int y = result.get(size - 1).get(i + 1);
                int sum = x + y;
                temp.add(sum);
            }
            temp.add(1);
            result.add(temp);
            size++;
        }

        return result;
    }
}
