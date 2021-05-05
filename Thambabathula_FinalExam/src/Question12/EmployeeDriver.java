/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Thambabathula Priyanka
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> empList = new ArrayList<>();
        System.out.println("Answer for question12 : Thambabathula Priyanka");
        Employee emp1 = new Employee("3", "Steve", "50000");
        Employee emp2 = new Employee("5", "John", "65000");
        Employee emp3 = new Employee("1", "Cath", "10000");
        Employee emp4 = new Employee("4", "Rose", "25000");
        Employee emp5 = new Employee("2", "Wick", "850000");

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        System.out.println("Original order");
        for (Employee emp : empList) {
            System.out.println(emp.toString());
        }

        System.out.println("\nSorted order by using Collections sort");
        Collections.sort(empList);
        System.out.println(empList);

        System.out.println("\nSorted order with SalarySorter");
        Collections.sort(empList, new SalarySorter());
        System.out.println(empList);

        System.out.println("\nSorted order with NameSorter");
        Collections.sort(empList, new NameSorter());
        System.out.println(empList);

    }

}
