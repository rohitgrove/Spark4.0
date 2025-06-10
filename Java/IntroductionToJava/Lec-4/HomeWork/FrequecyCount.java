public class FrequecyCount {
    public static void countFreq(int arr[]) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxElement = Math.max(arr[i], maxElement);
        }

        int count[] = new int[maxElement + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(i + " : " + count[i]);
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 2, 1 };
        printArr(arr);
        countFreq(arr);
    }
}
