/**
 * 2023.06.04
 * 49993. 스킬트리
 * https://school.programmers.co.kr/learn/courses/30/lessons/49993
 *
 * Site: Programmers
 * Level: 2
 * */

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int cnt = 0;

        for (String st : skill_trees) {
            st = st.replaceAll("[^" + skill + "]", "");
            for (int i=0; i<st.length(); i++) {
                if (skill.charAt(i) != st.charAt(i)) {
                    cnt++;
                    break;
                }
            }
        }

        return skill_trees.length - cnt;
    }
}