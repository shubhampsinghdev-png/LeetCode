class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        for(int num : nums){
            if(num % 2 == 0) ans[i++] = 0;
            else ans[i++] = 1;
        }
        Arrays.sort(ans);
    return ans;
    }
}