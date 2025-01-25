package EmployeeManagementSystem;

 class PartTimeEmployee extends Employee implements Department{
    private double hourlyRate;
    private String departmentName;

    public PartTimeEmployee(String employeeId, String name, double baseSalary, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (hourlyRate * 160); // Assuming 160 hours per month
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
