class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i : nums){
            total += i;
        }
    return (total % 2 == 0)? n-1 : 0;
    }
}