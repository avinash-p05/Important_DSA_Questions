import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = generatePascalsTriangle(n);
        System.out.println(list);
    }

    private static List<List<Integer>> generatePascalsTriangle(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // First element is always 1

            for (int j = 1; j < i; j++) {
                int value = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                row.add(value);
            }

            if (i > 0) {
                row.add(1); // Last element is always 1 if i > 0
            }

            list.add(row);
        }

        return list;
    }
}
