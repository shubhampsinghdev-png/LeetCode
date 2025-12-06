class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean c1 = false;
        boolean c2 = false;
        for(char c : word.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                c = Character.toLowerCase(c);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') c1 = true;
                else c2 = true;
            }else if(c >= '0' && c <= '9');
            else return false;
        }
    return c1 && c2;
    }
}