package Arrays;

public class rotateArray_06 {
    public  void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public  void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int b = n - k;

        int i = 0, j = b - 1;

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

        i = b;
        j = n - 1;

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        i = 0;
        j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        rotateArray_06 obj = new rotateArray_06();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.print("Original Array: ");
        obj.printArray(arr);

        obj.rotate(arr, k);

        System.out.print("\nRotated Array: ");
        obj.printArray(arr);
    }
}
