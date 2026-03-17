package tree;

class Diameter {

    // Global variable to track max diameter
    private int diameter = 0;

    /**
     * Returns the diameter (longest path between any two nodes)
     * @param root root of binary tree
     * @return diameter in terms of number of edges
     */
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    /**
     * Helper function to calculate height
     * and update diameter simultaneously
     */
    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        // Update diameter at current node
        diameter = Math.max(diameter, left + right);

        // Return height to parent
        return 1 + Math.max(left, right);
    }
}