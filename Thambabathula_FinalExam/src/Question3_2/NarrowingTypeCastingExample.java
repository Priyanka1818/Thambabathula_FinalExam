/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3_2;

/**
 *
 * @author Thambabathula Priyanka
 */
public class NarrowingTypeCastingExample {

    public static void main(String[] args) {
        double d = 186.786;
        //converting double data type into long data type  
        long l = (long) d;
        //converting long data type into int data type  
        int i = (int) l;
        System.out.println("Answer for question3_2 : Thambabathula Priyanka");
        System.out.println("Before conversion: " + d);

        System.out.println("After conversion into long type: " + l);

        System.out.println("After conversion into int type: " + i);
    }
}
