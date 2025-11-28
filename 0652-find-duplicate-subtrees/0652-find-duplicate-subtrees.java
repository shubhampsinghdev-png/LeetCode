class Solution {
    public String find(TreeNode node, List<TreeNode> res, HashMap<String, Integer> map){
        if(node == null) return "";
        String left = find(node.left, res, map);
        String right = find(node.right, res, map);
        int croot = node.val;
        String forward = croot + "$" + left + "$" + right;
        if(map.getOrDefault(forward, 0) == 1){
            res.add(node);
        }
        map.put(forward, map.getOrDefault(forward, 0) + 1);
    return forward;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String, Integer> map = new HashMap<>();
        List<TreeNode> ans = new ArrayList<>();
        find(root, ans, map);
        return ans;
    }
}