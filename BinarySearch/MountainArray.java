package BinarySearch;

public class MountainArray {

//    TC:O(logn) && SC:O(1)
    public static int peakIndexInMountainArray(int[] arr) {
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid!=0 && mid!=arr.length-1){
                if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                    return mid;
                } else if (arr[mid] < arr[mid+1]) {
                    lo = mid + 1;
                }else if(arr[mid] < arr[mid-1]){
                    hi = mid-1;
                }
            }else{
                if(mid==0){
                    lo = mid+1;
                }else {
                    hi=mid-1;
                }
            }
        }
        return -1;
    }

//    TC:O(n) && SC:O(1)
    public int peakIndexInMountainArray2(int[] arr) {
        int n = arr.length;
        for(int i = 1 ;i < n-1 ; i++){
            if(arr[i] > arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,4,3,1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("index: "+ans);
    }
}
