class Solution {
    public int height(TreeNode root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        int leftH = height(root.left);
        int rightH = height(root.right);
        return 1 + Math.max(leftH, rightH);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int leftH = height(root.left);
        if(root.left != null) leftH++;
        int rightH = height(root.right);
        if(root.right != null) rightH++;
        if(Math.abs(leftH - rightH) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);

    }
}