class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int a : array){
            if(a>height){
                answer+=1;
            }
        }
        return answer;
    }
}
// 프로그래머스 - 머쓱이보다 키 큰 사람