class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans =  new int[nums.length];
        int k = 0;
        for(int i = 0; i<n; i++){
            ans[k] = nums[i]; 
            k += 2;
        }
        k = 1;
        for(int j = n; j<nums.length; j++){
            ans[k] = nums[j];
            k += 2;
        }
    return ans;
    }
}