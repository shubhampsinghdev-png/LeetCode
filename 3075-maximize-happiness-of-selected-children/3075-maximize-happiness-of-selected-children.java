class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length - 1;
        Arrays.sort(happiness);
        long total = 0;
        for(int i = 0; i<k; i++){
            int curr = happiness[n - i] - i;
            if(curr <= 0) break;
            total += curr;
        }
    return total;
    }
}