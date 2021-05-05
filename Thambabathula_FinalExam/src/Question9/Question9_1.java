/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

import java.util.Scanner;

/**
 *
 * @author Thambabathula Priyanka
 */
public class Question9_1 {

    public static void main(String[] args) throws ArithmeticException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer for question9_Example1 : Thambabathula Priyanka");
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        try {
            if (a == 0) {
                throw new ArithmeticException("The integer value cannot be zero");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
