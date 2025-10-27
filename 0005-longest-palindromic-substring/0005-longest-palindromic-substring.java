class Solution {
    public boolean ispalin(String str){
        int i = 0;
        int j = str.length() -1;
        while(i <= j){
            char s = str.charAt(i);
            char e = str.charAt(j);
            if(s != e) return false;
            i++;
            j--;
        }
    return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = s.substring(0,1);
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                String sub = s.substring(i,j+1);
                if(ispalin(sub)){
                    if(sub.length() > ans.length()){
                        ans = sub;
                    }
                }
            }
        }
    return ans;
    }
}