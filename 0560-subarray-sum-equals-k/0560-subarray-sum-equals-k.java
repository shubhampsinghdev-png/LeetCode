class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i<n; i++){
            int prefix = 0;
            for(int j = i; j<n; j++){
                prefix = prefix + nums[j];
                if(prefix == k) {
                    cnt++;
                }
            }
            prefix = 0;
        }
    return cnt;
    }
}