package Arrays;
import java.util.Arrays;
public class MergeTwoSortedArrays_03 {
    public static void fastMerge(int nums1[] , int m , int nums2[],int n){
//        TC:O(nlogn)
        int i = m;
        for(int j = 0; j <= n-1; j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void merge(int nums1[] , int m , int nums2[] , int n){
        int arr[] = new int[m+n];
        int i = 0, j = 0 , k = 0;

        while(i <= m-1  && j <= n-1){
            if(nums1[i] <= nums2[j]){
                arr[k] = nums1[i];
                i++; k++;
            }else{
                arr[k] = nums2[j] ;
                j++;k++;
            }
        }

        while(i <= m-1 ){
            arr[k] = nums1[i];
            i++; k++;
        }
        while(j <= n-1){
            arr[k] = nums2[j] ;
            j++;k++;
        }

        for(i=0;i<m+n;i++){
            nums1[i] = arr[i] ;
        }

    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = nums1.length - nums2.length;
        int n = nums2.length;
        var st = System.nanoTime();
//        fastMerge(nums1 , m , nums2 , n);
        merge(nums1 , m , nums2 , n);

        var end = System.nanoTime();

        System.out.println("Time taken: " + (end - st));
//        for(int ele: nums1){
//            System.out.print(ele+" ");
//        }


    }
}
