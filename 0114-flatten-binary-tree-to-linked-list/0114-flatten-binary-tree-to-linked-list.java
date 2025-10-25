class Solution {
    public void list(TreeNode root, List<TreeNode> list){
        if(root == null) return;
        list.add(root);
        list(root.left, list);
        list(root.right, list);  
    }
    public void flatten(TreeNode root) {
        if(root == null) return;
        List<TreeNode> arr = new ArrayList<>();
        list(root, arr);
        
        for(int i = 1; i<arr.size(); i++){
            TreeNode prev = arr.get(i-1);
            TreeNode curr = arr.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }
}