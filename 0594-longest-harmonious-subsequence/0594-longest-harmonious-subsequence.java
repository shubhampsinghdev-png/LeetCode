class Solution {
    public int findLHS(int[] nums) {
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for(int num : nums){
            tree.put(num, tree.getOrDefault(num, 0) +1); 
        }
        int var = tree.firstKey();
        int max = 0;
        for(int key : tree.keySet()){
            if(var == key) continue;
            if(Math.abs(var - key) == 1) max = Math.max(max, tree.get(var) + tree.get(key));
            var = key;
        }
    return max;
    }
}