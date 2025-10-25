class Solution {
    public int totalMoney(int n) {
        int temp = 1;
        int k = temp;
        int ans = 0;
        for(int i = 1; i<=n; i++){    
            ans += k;
            k++;
        if(i % 7 == 0){
            temp++;
            k = temp;
            }
        }
    return ans;
    }
}