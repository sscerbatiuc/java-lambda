package learninglambda.calculator.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author sscerbatiuc
 */
public class ArraySortingUsingArrays {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
        Arrays.sort(array);

        String[] stringArr = new String[]{"aa", "zz", "cc", "bb"};
        String[] stringArr2 = new String[]{"aaaaa", "z", "cc", "bbb"};

        Arrays.sort(stringArr);
        Arrays.sort(stringArr2);

        printArray(stringArr);
        printArray(stringArr2);

        Arrays.sort(stringArr2, new StringByLengthComparator());
        printArray(stringArr2);

    }

    static void printArray(Object[] array) {
        System.out.print("[ ");
        for (Object el : array) {
            System.out.print(el + " ");
        }
        System.out.print("]\n");
    }
}

class StringByLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

}
