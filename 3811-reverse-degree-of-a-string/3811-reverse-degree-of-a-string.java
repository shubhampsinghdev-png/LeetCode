class Solution {
    public int reverseDegree(String s) {
        int cnt = 0;

        for(int idx = 0; idx<s.length(); idx++){
            int num = 26 - (s.charAt(idx) - 'a');
            cnt += num * (idx + 1);
        }
    return cnt;
    }
}