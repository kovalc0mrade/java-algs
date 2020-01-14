class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int item = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > item) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = item;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 1, 12, 11, 16, 5, 6, 15, 14, 13 };

        InsertionSort obj = new InsertionSort();
        obj.sort(arr);

        printArray(arr);
    }
}
