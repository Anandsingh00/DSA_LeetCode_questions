package Arrays;

public class sortedAndRotated_04 {
    public boolean check(int[] arr) {
        int count = 0;
        int i = 0;
        for(i = 0; i < arr.length-1; i++){
            if(arr[i] <= arr[i+1]){
                continue;
            }else{
                count++;
            }
        }

        if(arr[i]>arr[0]){
            count++;
        }

        return count <= 1;
    }
    public static void main(String[] args) {

    }
}
