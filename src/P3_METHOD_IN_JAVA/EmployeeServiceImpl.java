package P3_METHOD_IN_JAVA;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employees = new ArrayList<>();

    public void initEmployee()
    {
        employees.add(new Employee(1, "Nguyễn Xuân Giang 1", 20));
        employees.add(new Employee(2, "Nguyễn Xuân Giang 2", 21));
        employees.add(new Employee(3, "Nguyễn Xuân Giang 3", 22));
        employees.add(new Employee(4, "Nguyễn Xuân Giang 4", 23));
        employees.add(new Employee(5, "Nguyễn Xuân Giang 5", 19));
    }

    @Override
    public Employee findEmployeeById(int id) {
        initEmployee();
        for (Employee employee: employees) {
            if(employee.getId() == id)
            {
                return employee;
            }
        }
        return null;
    }

    @Override
    public boolean employeeIsExist() {
        return false;
    }
}
