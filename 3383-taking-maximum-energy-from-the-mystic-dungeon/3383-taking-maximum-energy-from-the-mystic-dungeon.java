class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[energy.length]; 
        int n = energy.length;
        for(int i = n-1; i>=0; i--){
            prefix[i] += energy[i] + (i+k < n ? prefix[i+k] : 0);
            max = Math.max(prefix[i] , max);
        }
    return max;
    }
}