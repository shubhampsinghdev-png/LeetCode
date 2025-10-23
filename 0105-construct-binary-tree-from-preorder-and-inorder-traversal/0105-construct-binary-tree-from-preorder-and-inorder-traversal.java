class Solution {
    public TreeNode helper(int[] preorder, int preLo, int preHi, int[] inorder, int inLo, int inHi){
        if(preLo > preHi) return null;
        TreeNode root = new TreeNode(preorder[preLo]);
        int i = inLo;
        while(inorder[i] != preorder[preLo]) i++;
        int leftSum = i - inLo;
        root.left = helper(preorder, preLo + 1, preLo + leftSum, inorder, inLo, i-1);
        root.right = helper(preorder, preLo + leftSum + 1, preHi, inorder, i+1, inHi);
    return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, 0, n-1, inorder, 0, n-1);
    }
}