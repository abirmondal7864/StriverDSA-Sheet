package recursionbacktracking;

import java.util.*;

class Permutations {

    /**
     * Returns all permutations of the array.
     */
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, new ArrayList<>(), used, result);

        return result;
    }

    /**
     * Backtracking function to build permutations.
     *
     * @param nums input array
     * @param curr current permutation being built
     * @param used tracks which elements are already used
     * @param result stores all permutations
     */
    private void backtrack(int[] nums, List<Integer> curr, boolean[] used,
                           List<List<Integer>> result) {

        // Base case: permutation complete
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Skip already used numbers
            if (used[i]) continue;

            // Choose
            curr.add(nums[i]);
            used[i] = true;

            // Explore
            backtrack(nums, curr, used, result);

            // Undo choice (Backtrack)
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}