class Solution {
    public int reverse(int n){
        int rev = 0;
        while(n > 0){
          int digit = n % 10;
          rev = rev*10 + digit;
          n = n / 10;
        }
    return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num : nums){
           int temp = reverse(num);
           set.add(temp);
        }
    return set.size();
    }
}