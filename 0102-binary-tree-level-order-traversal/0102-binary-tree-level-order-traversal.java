class Solution {
    public List<Integer> level(TreeNode root, int n){
        List<Integer> list = new ArrayList<>();
       if(root == null) return list;
       if(n == 1) list.add(root.val);
       else{
            list.addAll(level(root.left, n-1));
            list.addAll(level(root.right, n-1));
       }
    return list;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i<=height(root); i++){
            ans.add(level(root, i));
        }
    return ans;
    }
}