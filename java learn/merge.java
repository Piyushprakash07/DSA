class merge {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        int temp[] = new int[n];
        for (int size = 1; size < n; size = size * 2) {
            for (int left = 0; left < n - 1; left += 2 * size) {
                int mid = Math.min(left + size - 1, n - 1);
                int right = Math.min(left + 2 * size - 1, n - 1);
                int i = left;
                int j = mid + 1;
                int k = left;
                while (i <= mid && j <= right) {
                    if (arr[i] <= arr[j]) {
                        temp[k] = arr[i];
                        i++;
                    } else {
                        temp[k] = arr[j];
                        j++;
                    }
                    k++;
                }
                while (i <= mid) {
                    temp[k] = arr[i];
                    i++;
                    k++;
                }
                while (j <= right) {
                    temp[k] = arr[j];
                    j++;
                    k++;
                }
                for (int x = left; x <= right; x++) {
                    arr[x] = temp[x];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
