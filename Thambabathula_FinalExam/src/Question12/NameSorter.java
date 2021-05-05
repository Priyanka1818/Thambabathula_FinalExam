/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.Comparator;

/**
 *
 * @author Thambabathula Priyanka
 */
public class NameSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }

}
