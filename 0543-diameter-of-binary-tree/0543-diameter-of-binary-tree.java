class Solution {
    public int height(TreeNode root){
        if(root == null || root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null || root.left == null && root.right == null) return 0;
        int leftWays = diameterOfBinaryTree(root.left);
        int rightWays = diameterOfBinaryTree(root.right);
        int mid = height(root.left) + height(root.right);
        if(root.right != null) mid++;
        if(root.left != null) mid++;

    return Math.max(mid, Math.max(leftWays, rightWays));
    }
}