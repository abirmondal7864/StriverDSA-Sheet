package tree;

import java.util.*;

/**
 * Performs inorder traversal of a binary tree iteratively.
 *
 * Traversal Order: Left → Node → Right
 *
 * Approach:
 * 1. Use a Deque as a stack to simulate recursion.
 * 2. Push all left nodes into the stack.
 * 3. Pop node, visit it.
 * 4. Move to its right subtree.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)  // h = height of the tree
 */
class InOrder {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);      // go as left as possible
                curr = curr.left;
            }

            curr = stack.pop();       // process node
            result.add(curr.val);

            curr = curr.right;        // move right
        }

        return result;
    }
}