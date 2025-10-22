class Solution {
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public List<Integer> levelLR(TreeNode root, int n){
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        if(n == 1) list.add(root.val);
        else{
            list.addAll(levelLR(root.left, n-1));
            list.addAll(levelLR(root.right, n-1));
        }
    return list;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int height = height(root);
        for(int i = 1; i<=height; i++){
            if(i % 2 != 0){
                ans.add(levelLR(root, i));
            }else{
                List<Integer> temp = new ArrayList<>(levelLR(root, i));
                Collections.reverse(temp);
                ans.add(temp);
            }
        }
    return ans;
    }
}