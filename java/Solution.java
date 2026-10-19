import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            int a = list.get(list.size() - 1);
            if( a!=arr[i]){
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
// 프로그래머스 - 같은 숫자는 싫어