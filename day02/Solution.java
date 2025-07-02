import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            progresses[i] = (100-progresses[i]+speeds[i]-1)/speeds[i];
         
        }
        
        int now = progresses[0];
        int count = 1;
        
        for(int i=1; i<progresses.length; i++){
            if(progresses[i] <= now){
                count++;
            }
            else{
                result.add(count);
                count = 1;
                now = progresses[i];
            }                    
        }
        result.add(count);
        
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}