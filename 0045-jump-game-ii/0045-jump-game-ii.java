class Solution {
    public int jump(int[] nums) {
        int max = 0;
        int cnt = 0;
        int check = 0;
        for(int i = 0; i<nums.length-1; i++){
            max = Math.max(max, i + nums[i]);
            if(i == check){
                cnt++;
                check = max;
            }
        }
        
        return cnt;
    }
}