/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learninglambda.functional;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sscerbatiuc
 */
public class NewDemo {

    public static void main(String[] args) {
        List numbers = Arrays.asList(1,2,3,4);
        numbers.forEach((num) -> System.out.print(num));
        Employee emp = new Employee("name", "surname", 1250.0, LocalDate.of(1993, Month.MARCH, 12));
        Employee emp2 = new Employee("nameOld", "surnameOld", 12500.0, LocalDate.of(1955, Month.MARCH, 12));

        EmployeeValidator empSalaryValidator = (e) -> e.getSalary() > Double.valueOf(7000);
        EmployeeValidator under30Validator = (e) -> e.getBirthDate().until(LocalDate.now()).getYears() <= 30;

        System.out.println(empSalaryValidator.validate(emp));
        System.out.println(under30Validator.validate(emp));
        System.out.println(empSalaryValidator.validate(emp2));
        System.out.println(under30Validator.validate(emp2));
    }

// Using 2 lines above instead of 2 methods below
//    public boolean isSalaryAboveAverage(Employee emp, Double avg) {
//        return emp.getSalary() > avg;
//    }
//
//    public boolean isUnder30Years(Employee emp) {
//        return emp.getBirthDate().until(LocalDate.now()).getYears() <= 30;
//    }
}
