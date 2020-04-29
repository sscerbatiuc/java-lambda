/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learninglambda.calculator.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author sscerbatiuc
 */
public class ArrayListSortDemo1 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("E");
        arrayList.add("D");
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("A");

        arrayList.sort(new StringComparator());
        
        arrayList.sort(new Comparator<String>(){
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        
        arrayList.sort((String o1, String o2) -> {
            return o1.compareTo(o2); 
        });
        
        arrayList.sort((s1, s2) -> s1.compareTo(s2));
        // arrayList.sort(/* new StringComparator() */);

    }
}

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
    
}