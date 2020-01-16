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
public class ArrayListSortDemo4 {

    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Jack"));
        emp.add(new Employee("Jack1"));
        emp.add(new Employee("Jack2"));
        emp.add(new Employee("Jack3"));
        emp.add(new Employee("Jack4"));
        
        emp.sort((emp1, emp2)-> emp1.getName().compareTo(emp2.getName()));

    }
}

class Employee {

    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
