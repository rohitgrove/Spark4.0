public class ReverseArray {
    public static void reverse(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println("Before Reverse: ");
        printArr(arr);
        System.out.println("After Reverse: ");
        reverse(arr);
        printArr(arr);
    }
}
