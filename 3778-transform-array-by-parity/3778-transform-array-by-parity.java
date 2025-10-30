class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int cntEven = 0;
        int cntOdd = 0;
        for(int num : nums){
            if(num % 2 == 0) cntEven++;
            else cntOdd++;
        }
        int i = 0;
        while(cntEven-- > 0) ans[i++] = 0;
        while(cntOdd-- > 0) ans[i++] = 1;
    return ans;
    }
}