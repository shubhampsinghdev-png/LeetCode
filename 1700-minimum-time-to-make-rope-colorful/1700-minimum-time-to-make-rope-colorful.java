class Solution {
    public int minCost(String colors, int[] T) {
        int cnt = 0; 
        for(int i = 1; i<colors.length(); i++){
            int prevC = colors.charAt(i-1);
            int C = colors.charAt(i);
            if(prevC == C){
                int min = Math.min(T[i], T[i-1]);
                cnt += min;
                T[i] = Math.max(T[i], T[i-1]);
            }
        }
    return cnt;
    }
}