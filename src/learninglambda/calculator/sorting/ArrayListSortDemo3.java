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
public class ArrayListSortDemo3 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("EEE");
        arrayList.add("DDDDDD");
        arrayList.add("CC");
        arrayList.add("BBBBBBBBB");
        arrayList.add("A");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        // arrayList.sort(new StringComparator());
        arrayList.sort((String o1, String o2) -> {
            return o1.compareTo(o2);
        });
        arrayList.sort((o1, o2) -> o1.compareTo(o2));
        
        
        
        System.out.println("Alphabetical: " + arrayList);
        Comparator<String> comparatorByLength = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        // arrayList.sort(new StringComparatorByLength());
        arrayList.sort(comparatorByLength);
        System.out.println("By length: " + arrayList);

    }
}
