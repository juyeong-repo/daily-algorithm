/**
 * 2023.06.30
 * 1641. Count Sorted Vowel Strings
 * https://leetcode.com/problems/count-sorted-vowel-strings
 *
 * Site: Leetcode
 * Level: Medium
 *
 * ================
 * Comment:
 * DP 방법으로도 풀어보기
 * */
class Solution {
    public int countVowelStrings(int n) {
        // 중복조합
        // H(5, n) = C(5+n-1, n)
        int tmp = 4+n;
        double answer = 1;
        for (int i=1; i<=n; i++) {
            answer *= tmp--;
            answer /= i;
        }
        return (int)answer;
    }
}