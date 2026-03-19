package Arrays;

public class MoveZeroes_03 {
    public static void moveZeroes(int []arr) {
        int i = 0, j = 0;
        while(i < arr.length){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
//        int arr[] = {1};
        moveZeroes(arr);

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
