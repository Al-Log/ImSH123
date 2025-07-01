import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> result = new ArrayList<>();
        
        int init = -1;
        for(int num : arr){
            if(num != init){
                result.add(num);
                init = num;
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}