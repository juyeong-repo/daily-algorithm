import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < truck_weights.length; i++) {
			list.add(truck_weights[i]);
		}
        
        int[] bridge = new int[bridge_length]; 
        // bridge_length크기를 가진 배열 생성
        // 다리에는 최대 bridge_length대 올라갈 수 있음
        
        int sec = 0; // 경과시간
        int remove = 0; // 다리를 지난 트럭의 수
        
        while(remove != truck_weights.length) { // 다리를 지난 트럭의 수가 트럭의 총 갯수와 같아질 때까지 while문을 돌기
        	sec++;

        	if (bridge[bridge.length - 1] != 0) {
        		remove++; // 다리의 끝에 트럭이 있다면 remove++
        	}
        	
        	int sum = 0;
        	for (int i = bridge.length-1; i > 0; i--) {
				bridge[i] = bridge[i-1];
				sum += bridge[i];
			}
        	if (list.size() > 0) {        		
        		if (sum + list.getFirst() > weight) {
                // 올라갈 차례의 트럭과 다리 위의 트럭들의 무게가 
                // weight보다 크다면 트럭을 올리지 않음
        			bridge[0] = 0;
        		} else { // 트럭을 올릴 수 있는 무게라면 올리고 대기열에서 삭제
        			bridge[0] = list.getFirst();
        			list.removeFirst();
        		}
        	}
        	
        }
        
        answer = sec;
        
        return answer;
    }
}