class Solution {
    public void preOrder(TreeNode root, List<String> arr, String str){
        if(root == null) return;
        if(root.left == null && root.right == null){
            str += root.val;
            arr.add(str);
            return;
        }
        preOrder(root.left, arr, str + root.val + "->");
        preOrder(root.right, arr, str + root.val + "->");

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        preOrder(root, ans, "");
        return ans;
    }
}