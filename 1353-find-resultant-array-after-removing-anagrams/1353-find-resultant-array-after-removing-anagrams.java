class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        for(int i = words.length -1; i > 0; i--){
            if(words[i] == null) continue;
            char[] a = words[i].toCharArray();
            char[] b = words[i-1].toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            String A = new String(a);
            String B = new String(b);
            if(A.equals(B)){
                words[i] = null;
            }
            
        }
        List<String> list = new ArrayList<>();
        for(String key : words){
           if(key != null){
            list.add(key);
           }
        }
    return list;
    }
}