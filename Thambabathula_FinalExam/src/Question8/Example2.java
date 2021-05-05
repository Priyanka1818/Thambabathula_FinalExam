/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Thambabathula Priyanka
 */
public class Example2 {

    public static void main(String args[]) {
        System.out.println("Answer for question8 : Thambabathula Priyanka");
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
            int b = 30 / 0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } catch (ArithmeticException e) {
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Outside the try-catch block");
    }

}
