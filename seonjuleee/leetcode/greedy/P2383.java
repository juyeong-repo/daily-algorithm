/**
 * 2023.08.31
 * 2383. Minimum Hours of Training to Win a Competition
 * https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition
 *
 * Site: Leetcode
 * Level: Easy
 * */

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int answer = 0;

        int opEnergy = 0;
        int opExperience = 0;

        for (int i=0; i<energy.length; i++) {
            opEnergy += energy[i];
            if (initialExperience <= experience[i]) {
                int diff = experience[i] + 1 - initialExperience;
                answer += diff;
                initialExperience += diff;
            }
            initialExperience += experience[i];
        }

        if (initialEnergy <= opEnergy) {
            answer += opEnergy + 1 - initialEnergy;
        }

        return answer;
    }
}