class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i<n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int cnt = 0;
        for(int num : prefix){
            int val = num - goal;
            if(map.containsKey(val)){
                cnt += map.get(val);
            }
        map.put(num, map.getOrDefault(num, 0) + 1);
        }
    return cnt;
    }
}