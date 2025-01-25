package EmployeeManagementSystem;

import java.util.ArrayList;

public class EmployeeManagement {
  public static void main(String []args) {
      ArrayList<Employee> emp = new ArrayList<Employee>();
      FullTimeEmployee ftm = new FullTimeEmployee("049", "Deepraj", 27500.00, 9);
      ftm.assignDepartment("Artificial Intelligence");
      PartTimeEmployee prt = new PartTimeEmployee("032", "Aryan", 27500.00, 100);
      prt.assignDepartment("Java Fullstack");
      emp.add(ftm);
      emp.add(prt);
      for (Employee emp1 : emp) {
          emp1.displayDetails();
      }

  }
}
