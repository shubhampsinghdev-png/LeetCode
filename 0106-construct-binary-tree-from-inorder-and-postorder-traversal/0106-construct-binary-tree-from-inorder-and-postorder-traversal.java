class Solution {
    public TreeNode helper(int[] inorder, int inlo, int inhi, int[] postorder, int polo, int pohi){
        if(polo > pohi) return null;
        TreeNode root = new TreeNode(postorder[pohi]);
        int i = inlo;
        while(postorder[pohi] != inorder[i]) i++;
        int leftSum = i - inlo;
        root.left  = helper(inorder, inlo, i-1, postorder, polo, polo + leftSum -1);
        root.right = helper(inorder, i+1, inhi, postorder, polo+leftSum, pohi -1);
    return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return helper(inorder, 0, n-1, postorder, 0, n-1);
    }
}