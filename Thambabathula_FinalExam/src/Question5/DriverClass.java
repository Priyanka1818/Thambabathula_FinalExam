/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Thambabathula Priyanka
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question5 : Thambabathula Priyanka");
        ComparableCircle circle1 = new ComparableCircle(3);
        ComparableCircle circle2 = new ComparableCircle(2);
        System.out.println(circle1.toString());
        if (circle1.compareTo(circle2) > 0) {
            System.out.println("Circle1 is larger than Circle2.");
        } else if (circle1.compareTo(circle2) < 0) {
            System.out.println("Circle2 is larger than Circle1.");
        } else {
            System.out.println("Both circles are the same");
        }
    }
}
