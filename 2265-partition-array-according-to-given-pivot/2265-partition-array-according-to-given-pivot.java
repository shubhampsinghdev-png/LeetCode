class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        for(int num : nums){
            if(num < pivot){
                ans[i] = num;
                i++;
            }
        }
        for(int num : nums){
            if(num == pivot){
                ans[i] = num;
                i++;
            }
        }
        for(int num : nums){
            if(num > pivot){
                ans[i] = num;
                i++;
            }
        }
    return ans;
    }
}