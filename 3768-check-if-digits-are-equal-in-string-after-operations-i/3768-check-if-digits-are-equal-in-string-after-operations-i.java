class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        int[] arr = new int[n];
        int cnt = 0;
        for(char c : s.toCharArray()){
            arr[cnt++] = c - '0';
        }
        while(n > 2){
            for(int i = 1; i<n; i++){
                arr[i-1] = (arr[i-1] + arr[i]) % 10;
            }
        n--;
        }
    return arr[0] == arr[1];
    }
}