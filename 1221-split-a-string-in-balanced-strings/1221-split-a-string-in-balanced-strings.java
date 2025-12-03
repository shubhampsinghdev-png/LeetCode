class Solution {
    public int balancedStringSplit(String s) {
        int equi = 0;
        int cnt = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'R') equi++;
            else equi--;
            if(equi == 0) cnt++;
        }
    return cnt;
    }
}