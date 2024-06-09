/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {

        return BST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean BST(TreeNode root, long left, long right) {
        if (root != null) {

            // if the root value is out of bound of our range, we return false

            if (root.val <= left || root.val >= right)
                return false;

            // when going to left path, we maintain left value but change right value to
            // root.val to make sure current value is within range.

            // when going to right path, we maintain right value but change left value to
            // root.val to make sure current value is within range.
            return BST(root.left, left, root.val) && BST(root.right, root.val, right);
        }
        return true;
    }
}