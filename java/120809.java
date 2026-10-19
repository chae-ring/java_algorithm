class Solution {
    public int[] solution(int[] numbers) {
        for(int i=0; i<numbers.length; i++){
            numbers[i]*=2;
        }
        return numbers;
    }
}
// 프로그래머스 - 배열 두배 만들기