package EmployeeManagementSystem;

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department {
    private int workHours;
    private String departmentName;

    public FullTimeEmployee(String employeeId, String name, double baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (workHours * 20); // Bonus for extra hours
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return departmentName;
    }

}
