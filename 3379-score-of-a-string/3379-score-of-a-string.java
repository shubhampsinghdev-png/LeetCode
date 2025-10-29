class Solution {
    public int scoreOfString(String s) {
        int cnt = 0;
        for(int i = 1; i<s.length(); i++){
            char c1 = s.charAt(i-1);
            char c2 = s.charAt(i);
            cnt += Math.abs(c1 - c2);
        }
    return cnt;
    }
}