package Jan06;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeServiceImpl();
        Map<Integer, Employee> employees = service.getEmployees();

        employees.forEach((id, emp) -> {
            System.out.println(
                "ID: " + id +
                ", Name: " + emp.getName() +
                ", Salary: " + emp.getSalary() +
                ", Age: " + emp.getAge()
            );
        });
    }
}
