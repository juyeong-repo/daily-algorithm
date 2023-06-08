import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int idx = 0;

        for(Integer i : priorities){
            queue.add(i);
            queue2.add(idx);
            idx ++;
        }
        int max = Collections.max(queue);

        while(!queue.isEmpty()){
            int x = queue.poll();
            int y = queue2.poll();
            if( x==max && y==location){
                return answer;
            }else if(x == max){
                answer += 1;
                max = Collections.max(queue);
            }else{
                queue.add(x);
                queue2.add(y);
            }
        }

        return answer;
    }
}