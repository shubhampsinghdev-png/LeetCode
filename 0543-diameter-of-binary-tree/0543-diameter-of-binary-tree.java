class Solution {
    int max;
    public int height(TreeNode root){
        if(root == null) return 0;
        int leftWays = height(root.left);
        int rightWays = height(root.right);
        max = Math.max(max, leftWays + rightWays);
        return 1 + Math.max(leftWays, rightWays);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }
}