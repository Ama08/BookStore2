package org.stubbingExercise2;

public class CompanyFinanceCalculator {
    public int calculateWageBill(Department department) {

        int total = 0;
        System.out.println("Number of Employees in Department: " + department.getAllEmployees().size());
        for (Employee employee : department.getAllEmployees()){
            System.out.println("Employee Salary: " + employee.getSalary());
            total += employee.getSalary();
        }
        return total;
    }
}
