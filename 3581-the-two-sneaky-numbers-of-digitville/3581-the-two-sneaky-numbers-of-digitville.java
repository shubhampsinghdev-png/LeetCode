class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(!set.contains(nums[i])) set.add(nums[i]);
            else ans[j++] = nums[i];
        }
    return ans;
    }
}