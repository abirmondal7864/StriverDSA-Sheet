package arrays.hard;

import java.util.ArrayList;
import java.util.List;

class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        // Build each row 
        for (int i = 0; i < numRows; i++) { 
            List<Integer> row = new ArrayList<>();
            // ith row has i+1 elems    
            for (int j = 0; j < i + 1; j++) {
                // First and last are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                }
                // Middle values
                else {
                    int val = ans.get(i - 1).get(j - 1)
                            + ans.get(i - 1).get(j);
                    row.add(val);
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
