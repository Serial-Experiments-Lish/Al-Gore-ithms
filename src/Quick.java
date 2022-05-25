import java.util.Arrays;

public class Quick {
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int k = low - 1;

        for(int i = low; i < high; i++) {
            if(arr[i] <= pivot) {
                k++;

                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[k + 1];
        arr[k + 1] = arr[high];
        arr[high] = temp;

        return (k + 1);
    }

    static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int piv = partition(arr, low, high);

            quickSort(arr, low, piv - 1);
            quickSort(arr, piv + 1, high);
        }
    }

    public static void main(String[] args) throws Exception {
        int[] nmbrs = {11, 73, 98, 67, 21, 33, 82, 100};
        int n = nmbrs.length;

        Quick.quickSort(nmbrs, 11, n - 1);
    }
}