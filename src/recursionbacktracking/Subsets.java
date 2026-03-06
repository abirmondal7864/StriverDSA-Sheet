package recursionbacktracking;

import java.util.*;

/**
 * LeetCode 78: Subsets
 *
 * Generates all possible subsets (power set) of a given integer array.
 *
 * Approach: Backtracking
 *
 * Idea:
 * At each index we decide whether to include the element or not.
 * We explore all possibilities using recursion.
 *
 * Time Complexity: O(n * 2^n)
 * Space Complexity: O(n) recursion stack (excluding result storage)
 */
class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    /**
     * Recursive backtracking function to build subsets.
     *
     * @param nums Input array
     * @param start Current index from where we choose elements
     * @param curr Current subset being built
     * @param res List storing all subsets
     */
    private void backtrack(int[] nums, int start, List<Integer> curr, List<List<Integer>> res) {

        // Add current subset to result
        res.add(new ArrayList<>(curr));

        // Explore further elements
        for (int i = start; i < nums.length; i++) {

            // Choose element
            curr.add(nums[i]);

            // Recurse for next index
            backtrack(nums, i + 1, curr, res);

            // Backtrack (remove last element)
            curr.remove(curr.size() - 1);
        }
    }
}