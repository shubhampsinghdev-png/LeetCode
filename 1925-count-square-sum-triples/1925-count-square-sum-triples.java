class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                int c_ = i*i + j*j;
                int c = (int)Math.sqrt(c_);
                if(c<=n && c*c == c_) cnt++;
            }
        }
    return cnt;
    }
}