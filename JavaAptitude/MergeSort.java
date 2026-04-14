public class MergeSort {
    static void mergesort(int arr[], int l, int r, int mid) {
        int i = l, j = mid + 1;
        int temp[] = new int[r - l + 1];
        int idx = 0;
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[idx++] = arr[i];
                i++;
            } else {
                temp[idx++] = arr[j];
                j++;
            }
        }
        while (i <= mid) {
            temp[idx++] = arr[i];
            i++;
        }
        while (j <= r) {
            temp[idx++] = arr[j];
            j++;
        }
        for (int k = 0; k < temp.length; k++) {
            arr[k + l] = temp[k];
        }
    }

    static void merge(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            merge(arr, l, mid);
            merge(arr, mid + 1, r);
            mergesort(arr, l, r, mid);
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 5, 4, 8, 2, 9, 1, 7, 6, 3 };
        int l = 0, r = arr.length - 1;
        merge(arr, l, r);
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }

    }
}
