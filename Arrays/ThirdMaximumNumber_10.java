package Arrays;

public class ThirdMaximumNumber_10 {
    public static int thirdMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max ){
                third=sec;
                sec = max;
                max = arr[i];
            }
            if(arr[i]>=sec && arr[i] != max){
                sec = arr[i];
            }
            if(arr[i]>=third && arr[i]!= sec && arr[i]< sec){
                third = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Second Max:"+sec);
        System.out.println("Third Max:"+third);

        return third;
    }
    public static int maxNum(int arr[]){
        int maxNo = Integer.MIN_VALUE;
        for(int i = 0 ;i < arr.length ; i++){
            if(maxNo <= arr[i]){
                maxNo = arr[i];
            }
        }
        return maxNo;
    }

    public static int secNum(int arr[]){
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max ){
                sec = max;
                max = arr[i];
            }
            if(arr[i]>=sec && arr[i] != max){
                sec = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Second Max:"+sec);
        return sec;
    }

    public static void main(String[] args) {
        int arr [] = {9,7,10,5,3,2,1,0,-1};
        int ans = thirdMax(arr);
//        System.out.println(ans);
    }


}
