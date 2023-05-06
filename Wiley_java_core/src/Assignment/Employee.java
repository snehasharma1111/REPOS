package Assignment;

import java.util.*;

public class Employee implements Comparator<Employee> {
	public Employee() {
		
	}
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        int result = Double.compare(e2.getSalary(), e1.getSalary());
        if (result == 0) {
            result = e1.getName().compareTo(e2.getName());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 50000));
        employees.add(new Employee("David", 80000));
        employees.add(new Employee("Emily", 55000));
        employees.add(new Employee("Frank", 75000));
        
         Collections.sort(employees, new Employee());
        
        System.out.println("\nAfter sorting:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " (" + employee.getSalary() + ")");
        }
    }
}
        

