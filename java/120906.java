class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        int answer = 0;

        for(int i=0; i<str.length(); i++){
            answer+=str.charAt(i) - '0';
        }
        return answer;
    }
}
// 프로그래머스 - 자릿수 더하기