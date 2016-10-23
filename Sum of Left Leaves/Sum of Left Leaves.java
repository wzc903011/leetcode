/**Find the sum of all left leaves in a given binary tree.
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        if(root == null) return 0; // null
        if(root.left == null && root.right == null) return 0; // root || right
        
        if(root.left != null) {
            if (root.left.left == null && root.left.right == null) result += root.left.val;
            result += sumOfLeftLeaves(root.left);
        }
        if(root.right != null) {
            result += sumOfLeftLeaves(root.right);
        }
        return result;
    }
}