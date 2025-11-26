class Solution {
    public int dfs(TreeNode root, int x){
        if(root == null) return 0;
        x = x * 10 + root.val;
        if(root.left == null && root.right == null) return x;
    return dfs(root.left, x) + dfs(root.right, x);
    }
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
}