class Solution {
    public int countCollisions(String s) {
       int cnt = 0;
       int l = 0;
       int r = s.length() -1;
       char[] str = s.toCharArray();
       while(l < str.length && str[l] == 'L') l++;
       while(r >=0 && str[r] == 'R') r--;
       for(int i = l; i<= r; i++){
            if(str[i] != 'S') cnt++;
       }
    return cnt;
    }
}