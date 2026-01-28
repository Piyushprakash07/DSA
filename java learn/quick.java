class quick {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int[] stackLow = new int[n];
        int[] stackHigh = new int[n];
        int top = -1;
        top++;
        stackLow[top] = low;
        stackHigh[top] = high;
        while (top >= 0) {
            high = stackHigh[top];
            low = stackLow[top];
            top--;
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            int pos = i + 1;
            if (pos - 1 > low) {
                top++;
                stackLow[top] = low;
                stackHigh[top] = pos - 1;
            }

            if (pos + 1 < high) {
                top++;
                stackLow[top] = pos + 1;
                stackHigh[top] = high;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}