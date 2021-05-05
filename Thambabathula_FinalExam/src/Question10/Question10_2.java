/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author Thambabathula Priyanka
 */
public class Question10_2 {

    public static void main(String[] args) {
        System.out.println("Answer to question10 : Thambabathula Priyanka");
        int number = 20;
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);
    }

    public static int addNumbers(int num) {
        if (num != 0) {
            return num + addNumbers(num - 1);
        } else {
            return num;
        }
    }
}
