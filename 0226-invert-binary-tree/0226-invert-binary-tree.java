class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode leftInvert = invertTree(root.right);
        TreeNode rightInvert = invertTree(root.left);
        root.left  = leftInvert;
        root.right = rightInvert;
        return root;
    }
}