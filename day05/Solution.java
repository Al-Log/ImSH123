import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int bridgeWeight = 0;
        int truck = 0;

        for(int i = 0; i<bridge_length; i++){
            bridge.add(0);
        }

        while(!bridge.isEmpty()){
            time++;
            bridgeWeight -= bridge.poll();
            if(truck < truck_weights.length){
                if(bridgeWeight+truck_weights[truck] <= weight){
                    bridge.add(truck_weights[truck]);
                    bridgeWeight += truck_weights[truck];
                    truck++;
                }
                else{
                    bridge.add(0);
                }
            }
        }
        return time;
    }
}