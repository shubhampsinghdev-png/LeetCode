class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int count = 1; 
        int prev = 0;
        int max = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                count++;
            } else {
                prev = count;
                count = 1;
            }
            max = Math.max(max, Math.max(count >> 1, Math.min(prev, count)));
            if (max >=  k) return true;
        }
    return false;
    }
}
