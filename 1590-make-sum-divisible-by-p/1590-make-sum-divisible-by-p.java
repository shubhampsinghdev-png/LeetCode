class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum  = 0;
        int n = nums.length;
        for(int num : nums) sum = (sum + num) % p;
        int mod = sum % p;
        if(mod == 0) return 0;

        int prefix = 0;
        int result = n;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i<nums.length; i++){
            prefix = (prefix + nums[i]) % p;
            int need = (prefix - mod + p) % p;
            if(map.containsKey(need)){
                result = Math.min(result, i - map.get(need));
            } 
        map.put(prefix, i);
        }
    return (result == n)? -1 : result; 
    }
}