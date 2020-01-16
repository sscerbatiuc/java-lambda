package learninglambda.functional;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author sscerbatiuc
 */
public class OldDemo {

    public static void main(String[] args) {
        Employee emp = new Employee("name", "surname", 1250.0, LocalDate.of(1993, Month.MARCH, 12));
        Employee emp2 = new Employee("nameOld", "surnameOld", 12500.0, LocalDate.of(1955, Month.MARCH, 12));

        System.out.println(isSalaryAboveAverage(emp, Double.valueOf(7000)));
        System.out.println(isSalaryAboveAverage(emp2, Double.valueOf(600)));

        System.out.println(isUnder30Years(emp));
        System.out.println(isUnder30Years(emp2));
    }

    public static boolean isSalaryAboveAverage(Employee emp, Double avg) {
        return emp.getSalary() > avg;
    }

    public static boolean isUnder30Years(Employee emp) {
        return emp.getBirthDate().until(LocalDate.now()).getYears() <= 30;
    }
}
