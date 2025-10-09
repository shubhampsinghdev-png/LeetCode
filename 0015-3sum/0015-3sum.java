class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = nums.length -1; i>=2; i--){
            if( i < nums.length-1 && nums[i] == nums[i+1]) continue;
            int left = 0;
            int right = i-1;
            while(left < right){
                int sum = nums[left] + nums[right] + nums[i];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right -1]) right--;
                    left++;
                    right--;
                }
                else if(sum > 0){
                   right--;
                }else{
                    left++;
                }
            }
        }
    return ans;
    }
}