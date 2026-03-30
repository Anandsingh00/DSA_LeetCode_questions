package Arrays;

import java.util.HashMap;

public class SingleNumber3_09 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2,5};

        int ans[] = singleNumber(arr);

        for(int ele : ans){
            System.out.print(ele +" ");
        }
    }

    public  static int[] singleNumber(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int arr[] = new int[2];

        for(int ele: nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }else{
                map.put(ele,1);
            }
        }
        int i = 0;
        for(int ele: map.keySet()){
            int freq = map.get(ele);
            if(freq == 1){
                arr[i] = ele;
                i++;
            }
        }

        return  arr;
    }

}
