public class RotateArrLeft1 {
    public static void rotate(int arr[]) {
        int val = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = val;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        printArr(arr);
        rotate(arr);
        printArr(arr);
    }
}
