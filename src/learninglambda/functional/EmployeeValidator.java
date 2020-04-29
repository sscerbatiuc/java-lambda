package learninglambda.functional;

/**
 *
 * @author sscerbatiuc
 */
@FunctionalInterface
public interface EmployeeValidator {
    public boolean validate(Employee emp);
}
