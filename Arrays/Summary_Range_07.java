package Arrays;

import java.util.*;

public class Summary_Range_07 {

    public List<String> summaryRanges(int[] arr) {
        int n = arr.length;
        List<String> ans = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            if(i==n-1){
                ans.add(String.valueOf(arr[i]));
                break;
            }
            if(arr[i+1] == arr[i]+1){
                int j = i;

                while(j <= n-2 && arr[j+1] == arr[j] + 1){
                    j++;
                }

                ans.add(arr[i] + "->" + arr[j]);
                i=j;
            }else{
                ans.add(String.valueOf(arr[i]));
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Summary_Range_07 obj = new Summary_Range_07();

        // Test Case 1
        int[] nums1 = {0,1,2,4,5,7};
        System.out.println(obj.summaryRanges(nums1));

        // Test Case 2
        int[] nums2 = {0,2,3,4,6,8,9};
        System.out.println(obj.summaryRanges(nums2));

        // Test Case 3
        int[] nums3 = {1,3,5,7};
        System.out.println(obj.summaryRanges(nums3));

        // Test Case 4
        int[] nums4 = {1,2,3,4,5};
        System.out.println(obj.summaryRanges(nums4));

        // Test Case 5
        int[] nums5 = {5};
        System.out.println(obj.summaryRanges(nums5));

        // Test Case 6
        int[] nums6 = {};
        System.out.println(obj.summaryRanges(nums6));
    }
}