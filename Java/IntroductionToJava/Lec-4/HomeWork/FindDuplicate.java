public class FindDuplicate {
    public static void findDuplicate(int arr[]) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxElement = Math.max(arr[i], maxElement);
        }

        int count[] = new int[maxElement + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 4, 1 };
        findDuplicate(arr);
    }
}
