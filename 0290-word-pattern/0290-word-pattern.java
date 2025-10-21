class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        int i = 0;
        for(String word : words){
            char let = pattern.charAt(i);
            if(map.containsKey(let)){
                if(!map.get(let).equals(word)) return false;
            }else{
                if(map.containsValue(word)) return false;
                map.put(let, word);
            }
            i++;
        } 
    return true;
    }
}