package Arrays;

public class sortColors_02 {

    public static void sortColors1(int arr[]){
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            }else if(arr[i] == 1){
                oneCount++;
            }else {
                twoCount++;
            }
        }

        for(int i = 0; i < arr.length ; i++){
            if(i+1 <= zeroCount ){
                arr[i] = 0;
            }else if(i < zeroCount+oneCount){
                arr[i] = 1;
            }else{
                arr[i] = 2;
            }
        }

    }

    public static void sortColors2(int arr[]){
        int lo = 0;
        int hi = arr.length - 1;
        int i = 0;
        while(lo<hi) {
            if (arr[i] == 1) {
                i++;
            }else if(arr[i]==0){
                int temp = arr[lo];
                arr[lo] = arr[i];
                arr[i] = temp;
                lo++;i++;
            }else{
                int temp =arr[hi];
                arr[hi] = arr[i];
                arr[i] = temp;
                hi--; i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sortColors1(arr);
        sortColors2(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
