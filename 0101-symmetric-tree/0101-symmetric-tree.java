class Solution {
    public TreeNode invert(TreeNode root){
        if(root == null) return root;
        TreeNode l = invert(root.right);
        TreeNode r = invert(root.left);
        root.left = l;
        root.right = r;
    return root;
    }
    public boolean same(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
    return same(p.left, q.left) && same(p.right, q.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null) return true;
        return same(root.right, invert(root.left));
     }
}