class Solution {
    public int nth(TreeNode node, int n){
        if(node == null || n == 0) return 0;
        if(n == 1) return node.val;
        return nth(node.left, n-1) + nth(node.right, n-1);
    }

    public int height(TreeNode node){
        if(node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int maxLevelSum(TreeNode root) {
        int h = height(root);
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for(int i = 1; i<=h; i++){
            int nmax = nth(root, i);
            if(max < nmax){
                max = Math.max(max, nmax);
                idx = i;
            }
        }
    return idx;
    }
}