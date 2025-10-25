class Solution {
    public void helper(TreeNode root, List<List<Integer>> ans, List<Integer> arr, int targetSum){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            arr.add(root.val);
            if(targetSum == root.val){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<arr.size(); i++){
                temp.add(arr.get(i));
            }
            ans.add(temp);
            }
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        helper(root.left, ans, arr, targetSum - root.val);
        helper(root.right, ans, arr, targetSum - root.val);
        arr.remove(arr.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>  arr = new ArrayList<>();
        helper(root, ans, arr, targetSum);
        return ans;
    }
}