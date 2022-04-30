import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Test {


    public static void main(String[] args) throws InterruptedException {

        int[] arr = new int[]{-1, 2, 0, 1, 3, 5, 4, 9};
        System.out.println(isIt(arr));
        System.out.println(Arrays.toString(arr));

    }

    public static boolean isIt(int[] arg) {
        boolean res = false;
        Arrays.sort(arg);

        for (int i : arg) {
            if (i == 0) {
                for (int j = 0; j < arg.length; j++) {
                    if (arg[j] == arg[arg.length - 1]) {
                        break;
                    }
                    if (arg[j + 1] == arg[j] + 1) {
                        res = true;
                    } else res = false;
                }
                return res;
            } else return res = false;
        }
        return res;
    }
}