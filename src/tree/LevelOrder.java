package tree;

import java.util.*;

class LevelOrder {

    /**
     * Performs level order traversal (BFS) of a binary tree.
     * Each level of the tree is stored as a separate list.
     *
     * Idea:
     * - Use a queue to process nodes level by level.
     * - At each iteration, queue size represents the number
     *   of nodes in the current level.
     *
     * Time Complexity  : O(N)
     * Space Complexity : O(N)
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        // Edge case: empty tree
        if (root == null) return result;

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root); // start BFS with root

        while (!queue.isEmpty()) {

            int size = queue.size(); // nodes in current level
            List<Integer> level = new ArrayList<>();

            // process all nodes of this level
            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();
                level.add(node.val);

                // push children for next level
                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }

            result.add(level);
        }

        return result;
    }
}