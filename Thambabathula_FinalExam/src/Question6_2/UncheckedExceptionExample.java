/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6_2;

/**
 *
 * @author Thambabathula Priyanka
 */
public class UncheckedExceptionExample {

    public static void main(String args[]) {
        System.out.println("Answer for question6_2 : Thambabathula Priyanka");
        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The specified index does not exist " + "in array. Please correct the error.");
        }
    }
}
