import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int num= nums.length / 2;
        
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
            if(set.size()==num){
                break;
            }
        }
        int answer = set.size();
        return answer;
    }
}

// 프로그래머스 - 폰켓몬
/*
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        return Math.min(set.size(), nums.length / 2);
    }
}
 */