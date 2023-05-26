import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            int count = map.get(player);
            if (count > 1) {
                map.put(player, count - 1);
            } else {
                map.remove(player);
            }
        }

        return map.keySet().iterator().next();
    }
}