package Arrays;

import java.util.HashMap;

public class DuplicateElement_11 {

//      Method 1 : TC:O(n) SC:O(n)
    public static int findDuplicate(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }else{
                map.put(ele,1);
            }
        }


        for(int key : map.keySet()){
            if(map.get(key)>1) return key;
        }
        return -1;
    }

    public static  int findDuplicate2(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,10,9,14,2};
        int ans = findDuplicate(arr);
        System.out.println("Duplicate Number: " + ans);

        int ans2 = findDuplicate2(arr);
        System.out.println("Duplicate Number: " + ans2);
    }
}
