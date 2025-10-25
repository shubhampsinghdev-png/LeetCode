class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char[]  temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String str = new String(temp);
            if(!map.containsKey(str)){
                map.put(str,  new ArrayList<>());
            }
        map.get(str).add(strs[i]);
        }
    List<List<String>> ans = new ArrayList<>();
    for(String key : map.keySet()){
        ans.add(map.get(key));
    }

    return ans;
    }
}