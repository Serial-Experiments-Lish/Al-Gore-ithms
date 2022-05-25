import java.util.Arrays;

public class Bubble {
    static void bubbleSort(int arr[], int n) {
        n = 7;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] sample = {2, 19, 54, 213, 147, 1001, 25};

        Bubble.bubbleSort(sample, 7);
    }
}