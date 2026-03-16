package tree;

class MaxDepth {

    /**
     * Returns the maximum depth (height) of the binary tree.
     *
     * Depth = number of nodes in the longest path from root to a leaf.
     *
     * Approach:
     * Uses DFS recursion. For each node we compute the depth of
     * its left subtree and right subtree, then take the maximum.
     *
     * Formula:
     * depth = 1 + max(depth(left), depth(right))
     *
     * Base Case:
     * If node is null → return 0
     *
     * Time Complexity: O(n)
     * Each node is visited exactly once.
     *
     * Space Complexity: O(h)
     * Recursion stack where h = height of tree.
     */
    public int maxDepth(TreeNode root) {

        // Base case: empty tree has depth 0
        if (root == null) {
            return 0;
        }

        // Recursively compute depth of left subtree
        int leftDepth = maxDepth(root.left);

        // Recursively compute depth of right subtree
        int rightDepth = maxDepth(root.right);

        // Current node contributes 1 to the depth
        return 1 + Math.max(leftDepth, rightDepth);
    }
}