/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3_1;

/**
 *
 * @author Thambabathula Priyanka
 */
public class WideningTypeCastingExample {

    public static void main(String[] args) {
        int x = 10;
        //automatically converts the integer type into long type  
        long y = x;
        //automatically converts the long type into float type  
        float z = y;
        System.out.println("Answer for question3 : Thambabathula Priyanka");
        System.out.println("Before conversion, int value " + x);
        System.out.println("After conversion, long value " + y);
        System.out.println("After conversion, float value " + z);
    }

}
