package learninglambda.calculator.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This class demonstrates sorting the array list by 2 criterions: <br/>
 * 1. alphabetical <br/>
 * 2. by the String's length
 *
 * @author sscerbatiuc
 */
public class ArrayListSortDemo2 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("EEE");
        arrayList.add("DDDDDD");
        arrayList.add("CC");
        arrayList.add("BBBBBBBBB");
        arrayList.add("A");

        arrayList.sort(new AlphabeticalStringComparator());
        System.out.println("Alphabetical: " + arrayList);
        arrayList.sort(new StringComparatorByLength());
        System.out.println("By length: " + arrayList);

    }
}

class AlphabeticalStringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class StringComparatorByLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
