class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int cnt = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') cnt++;
            else if(c == ')') cnt--;
            max = Math.max(max, cnt);
        }
    return max;
    }
}