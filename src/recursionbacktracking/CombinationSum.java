package recursionbacktracking;

import java.util.*;

/**
 * LeetCode: Combination Sum
 *
 * Finds all unique combinations of numbers that sum to the target. Each number
 * in candidates can be used unlimited times.
 *
 * Approach: Backtracking (DFS). Try each candidate starting from a given index
 * to avoid duplicate combinations. Reuse the same index since elements can be
 * chosen multiple times.
 *
 * Time Complexity: O(2^target) (approx, depends on recursion tree) Space
 * Complexity: O(target) recursion depth
 */
class CombinationSum {

    /**
     * Returns all combinations where the chosen numbers sum to target.
     *
     * @param candidates array of distinct integers
     * @param target desired sum
     * @return list of all valid combinations
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        // Start backtracking
        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    /**
     * Backtracking helper function.
     *
     * @param candidates available numbers
     * @param target remaining target to achieve
     * @param start starting index to avoid permutations
     * @param current current combination being built
     * @param result stores valid combinations
     */
    private void backtrack(int[] candidates, int target, int start,
            List<Integer> current,
            List<List<Integer>> result) {

        // Base case: valid combination found
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try each candidate from start index
        for (int i = start; i < candidates.length; i++) {

            // If candidate exceeds target, skip
            if (candidates[i] > target) {
                continue;
            }

            // Choose the number
            current.add(candidates[i]);

            // Recurse with same index (since repetition allowed)
            backtrack(candidates, target - candidates[i], i, current, result);

            // Backtrack (remove last element)
            current.remove(current.size() - 1);
        }
    }
}
