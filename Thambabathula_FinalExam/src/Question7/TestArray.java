/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author Thambabathula Priyanka
 */
public class TestArray {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Answer for question7 : Thambabathula Priyanka");
        System.out.println("Enter Array index : ");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Entered index value: " + arr[sc.nextInt()]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");

        }
    }
}
