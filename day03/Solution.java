class Solution {
    boolean solution(String s) {
        
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }
            else{
                if(count>0){
                    count--;
                }
                else{
                    return false;
                }
            }
        }

        return count==0;
    }
}