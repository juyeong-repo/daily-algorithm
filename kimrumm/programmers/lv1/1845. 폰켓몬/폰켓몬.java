import java.util.HashSet;

class Solution {
public int solution(int[] nums) {

        // 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택
        int pickPoncket = nums.length / 2;

        // HashSet
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        if (set.size() > pickPoncket) {
            return pickPoncket;
        } else {
            return set.size();
        }
    }
}
