class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length; 
        int[] arr = new int[10001];

        for(int i = 0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        for(int i = 0; i<arr.length; i++){
            if(n / 2 <= arr[i]) return i;
        }
    return 0;
    }
}