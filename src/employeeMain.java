public class employeeMain {
    public static void main(String[] args) {
        employee OneEmployee = new employee("John", 20, 10000, "London");

        employee TwoEmployee = new employee("Karen", 50, 20000, "Kent");

        OneEmployee.raiseSalary();

        System.out.println("John: " + OneEmployee.salary);

        System.out.println(TwoEmployee.name);
    }
}
