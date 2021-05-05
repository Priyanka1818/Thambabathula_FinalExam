/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

/**
 *
 * @author Thambabathula Priyanka
 */
public class Employee extends SalarySorter implements Comparable<Employee> {

    private String empId;
    private String empName;
    private String empSalary;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public Employee(String empId, String empName, String empSalary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "\n[empId=" + empId + "  empName=" + empName + "  empSalary=" + empSalary + "]";
    }

    @Override
    public int compareTo(Employee o) {
        return this.getEmpId().compareTo(o.getEmpId());
    }

    public int compareWithName(Employee o) {
        return this.getEmpName().compareTo(o.getEmpName());
    }
}
