public class CountEvenOdd {
    public static void countEvenOdd(int arr[]) {
        int odd = 0;
        int even = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if ((arr[idx] & 1) == 1) {
                odd++;
            } else {
                even++;
            }
        }

        System.out.println("Odd Numbers count: " + odd);
        System.out.println("Even Numbers count: " + even);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 8 };
        countEvenOdd(arr);
    }
}