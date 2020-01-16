package learninglambda.functional;

import java.time.LocalDate;

/**
 *
 * @author sscerbatiuc
 */
public class Employee {

    private String name, surname;
    private Double salary;
    private LocalDate birthDate;

    public Employee(String name, String surname, Double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Employee(String name, String surname, Double salary, LocalDate birthDate) {
        this(name, surname, salary);
        this.birthDate = birthDate;
    }
    
    

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

}
