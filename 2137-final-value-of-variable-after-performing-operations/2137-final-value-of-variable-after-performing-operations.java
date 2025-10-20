class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(String str : operations){
            StringBuilder res = new StringBuilder();
            int i = 0;
            while(i < str.length()){
                res.append(str.charAt(i));
                i++;
            }
            String st = res.toString();
            if(st.equals("X++")){
               X++;
            }else if(st.equals("++X")){
                ++X;
            }else if(st.equals("X--")){
                X--;
            }else{
                --X;
            }
        }
    return X;
    }
}