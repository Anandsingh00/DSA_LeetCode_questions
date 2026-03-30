package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber2_08 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele : nums){
            if(map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }

        int a = 0;
        for(int key : map.keySet()){
           a = (map.get(key) == 1) ? key : 1 ;
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
