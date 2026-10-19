class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i =my_string.length(); i>0; i--){
            answer+=my_string.charAt(i-1);
        }

        return answer;
    }
}
// 프로그래머스 - 문자열 뒤집기