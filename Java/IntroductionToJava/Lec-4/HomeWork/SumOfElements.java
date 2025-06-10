public class SumOfElements {
    public static int sumOfElements(int arr[]) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 }; // -> 15
        int ans = sumOfElements(arr);
        System.out.println("sum of array: " + ans);
    }
}