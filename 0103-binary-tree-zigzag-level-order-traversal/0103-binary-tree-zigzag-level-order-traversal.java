class Solution {
    public int height(TreeNode root){ //Give height with respect to node... not by level
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public void LR(TreeNode root, int n, List<Integer> list){
        if(root == null) return;
        if(n == 1){
            list.add(root.val);
            return;
        }
        LR(root.left, n-1, list);
        LR(root.right, n-1, list);
    }

    public void RL(TreeNode root, int n, List<Integer> list){
        if(root == null) return;
        if(n == 1){
            list.add(root.val);
            return;
        }
        RL(root.right, n-1, list);
        RL(root.left, n-1, list);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        int height = height(root);
        for(int i = 1; i<= height; i++){
            List<Integer> temp = new ArrayList<>();
            if(i%2 == 1){
                LR(root, i, temp);
            }else{
                RL(root, i, temp);
            }
            ans.add(temp);
        }
    return ans;  
    }
}