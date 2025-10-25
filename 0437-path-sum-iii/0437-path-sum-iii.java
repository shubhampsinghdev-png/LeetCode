class Solution {
    public int paths(TreeNode root, long targetSum){ 
        if(root == null) return 0;
        int cnt = 0;
        if((long)root.val == targetSum) cnt++;
    return cnt + paths(root.left, targetSum - (long)root.val) + paths(root.right, targetSum - (long)root.val);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        int count = paths(root, (long)targetSum);
        count += pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    return count;
    }
}