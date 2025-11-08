class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        if(n == 1) return ans;
        ans[n-1] = 0;
        for(int i = n-2; i>=0; i--){
            ans[i] = ans[i+1] + nums[i+1];
        }
        int temp=0;
       for(int i=0;i<n;i++){
        ans[i]=Math.abs(ans[i]-temp);
        temp+=nums[i];
       }
    return ans;
     }
}