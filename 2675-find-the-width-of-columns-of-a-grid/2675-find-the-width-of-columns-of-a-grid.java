class Solution {
    public int digCnt(int n){
        if(n == 0) return 1;
        boolean sign = true;
        if(n < 0){
            n = (-1)*n;
            sign = false;
        }
        int cnt = 0;
        while(n > 0){
            cnt++;
            n /=10;
        }
    return (sign)? cnt : cnt + 1;
    }

    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length; 
        int n = grid[0].length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                ans[j] = Math.max(ans[j], digCnt(grid[i][j]));
            }
        }
    return ans;
    }
}