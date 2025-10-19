class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] hash = new int[nums.length];
        Arrays.fill(hash, -1);
        for(int i = 0; i<nums.length; i++){
            hash[nums[i] - 1]++;
        }
        for(int i = 0; i<nums.length; i++){
            if(hash[i] == -1){
                list.add(i + 1);
            }
        }
    return list;
    }
}