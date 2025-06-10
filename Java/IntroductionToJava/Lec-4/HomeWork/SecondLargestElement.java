public class SecondLargestElement {
    public static int secondLargestElement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }

        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                secondMax = Math.max(secondMax, arr[i]);
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 8, 6 };
        System.out.println(secondLargestElement(arr));
    }
}