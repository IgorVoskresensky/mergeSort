import java.util.Arrays;

public class Garbage {

    public static void main(String[] args) throws InterruptedException {

        int[] a = new int[]{1, 4, 232, 434, 56, 1, 56, 75, 87, -1, 0};
        sort(a);

        System.out.println(Arrays.toString(a));


    }

    public static void sort(int[] a) {

        if (a.length > 1) {
            int middle = a.length / 2;
            int[] left = new int[middle];
            int[] right = new int[a.length - middle];

            for (int i = 0; i < middle; i++) {
                left[i] = a[i];
            }
            for (int i = middle; i < a.length; i++) {
                right[i - middle] = a[i];
            }
            sort(left);
            sort(right);
            merge(a, left, right);
        }
    }

    public static void merge(int[] a, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[index] = left[i];
                i++;
            } else {
                a[index] = right[j];
                j++;
            }
            index++;
        }
        for (int leftRest = i; leftRest < left.length; leftRest++) {
            a[index++] = left[leftRest];
        }
        for (int rightRest = j; rightRest < right.length; rightRest++) {
            a[index++] = right[rightRest];
        }

    }
}
