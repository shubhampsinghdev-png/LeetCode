class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        ArrayList<Integer> list = new ArrayList<>();
        int bean = 0;
        for(int i = 0; i<n; i++){
            String str = bank[i];
            for(int j = 0; j<str.length(); j++){
                int num = str.charAt(j) - '0';
                if(num == 1) bean++;
            }
        if(bean > 0) list.add(bean);
        bean = 0;
        }
        if(list.size() <= 1) return 0;
        int cnt = 0;
        for(int i = 1; i<list.size(); i++){
            cnt += list.get(i-1) * list.get(i);
        }
    return cnt;
    }
}