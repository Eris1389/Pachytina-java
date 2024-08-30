import java.util.Arrays;

public class FilterArrayNumbers {
    static int[] numberArr;

    public static void main (String[] args) {
        numberArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(filterArray(numberArr)));
    }

    public static int[] filterArray (int[] arr) {
        return  Arrays.stream(numberArr).filter(s -> s % 2 == 0).toArray();
    }

}
