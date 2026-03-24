// class TreeNode {
//     int val;
//     TreeNode left, right;
//     TreeNode(int x) {
//         val = x;
//     }
// }

class Solution {
    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return ((left.val == right.val) && (isMirror(left.left, right.right)) && isMirror(left.right, right.left));
    }
    public boolean isSymmetric(TreeNode root) {
        // write your code here 
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
}
