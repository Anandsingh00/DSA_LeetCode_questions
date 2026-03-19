package Arrays;

public class SingleNumber_01 {
//    TC:O(n^2) SC:O(n)
    static int singleNumber1(int [] arr){
        int freq[] = new int[arr.length];

        for(int i = 0 ; i < arr.length ;i++){
            int ele = arr[i];
            int f = 0; //for storing freq of numbers
            for(int j = 0 ; j < arr.length;j++){
                if(arr[j] == ele) f++;
            }
            freq[i] = f;
        }
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(freq[i]+" ");
        }
        System.out.println( );
        for(int i = 0 ;i < freq.length; i++){
            if(freq[i] == 1){
                return arr[i];
            }
        }
        return -1;
    }

//    static int singleNumber(lint arr[]){
//
//    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2};
        int res = singleNumber1(arr);
        System.out.println("Result: " +res);
    }
}
