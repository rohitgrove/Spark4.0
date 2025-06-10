public class FindMaxElement {
    public static int maxElement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 2, 9, 4 };
        System.out.println(maxElement(arr));
    }
}