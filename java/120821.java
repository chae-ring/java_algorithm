class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int a =0;
        for(int i=num_list.length; i>0; i--){
            answer[a]=num_list[i-1];
            a++;
        }
        return answer;
    }
}
// 프로그래머스 - 배열 뒤집기