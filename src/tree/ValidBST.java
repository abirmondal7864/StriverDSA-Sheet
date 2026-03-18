package tree;

class ValidBST {

    /**
     * Validates if a binary tree is a BST.
     * Uses range propagation (min, max).
     *
     * @param root the root of the tree
     * @return true if valid BST, else false
     */
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    /**
     * Recursively checks if node values lie within (min, max)
     */
    private boolean validate(TreeNode node, long min, long max) {
        // Base case
        if (node == null) return true;

        // Check violation
        if (node.val <= min || node.val >= max) return false;

        // Left subtree → max becomes node.val
        // Right subtree → min becomes node.val
        return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }
}