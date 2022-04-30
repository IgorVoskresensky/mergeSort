import java.util.Arrays;

public class FuckingTest {
    public static void main(String[] args) {

        int[] a = {2, 1, 6, 3, -2};
        mergeSort(a, 0, a.length -1);
        System.out.println(Arrays.toString(a));
    }

    static void mergeSort(int[] arr, int p, int r) {

        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }

    }

    static void merge(int[] arr, int p, int q, int r) {
        int[] temp1, temp2;

        temp1 = new int[q - p + 1];
        temp2 = new int[r - q];

        for (int i = 0; i < (q - p + 1); i++) {
            temp1[i] = arr[p + i];
        }

        for (int j = 0; j < (r - q); j++) {
            temp2[j] = arr[q + j + 1];
        }

        int i = 0, j = 0;

        for (int k = p; k <= r; k++) {
            if (i != temp1.length && (j == temp2.length || temp1[i] < temp2[j])) {
                arr[k] = temp1[i];
                i++;
            } else {
                arr[k] = temp2[j];
                j++;
            }
        }
    }
}
