class Solution {
    public String preorder(TreeNode root){
        if(root == null) return "X";
        StringBuilder res = new StringBuilder();
        res.append(root.val);
        res.append(preorder(root.left));
        res.append(preorder(root.right));
    return res.toString();
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String str1 = new String(preorder(p));
        String str2 = new String(preorder(q));
        return (str1.equals(str2))?  true : false;
    }
}