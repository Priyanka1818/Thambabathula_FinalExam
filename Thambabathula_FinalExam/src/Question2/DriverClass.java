/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

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
        System.out.println("Answer for question2 : Thambabathula Priyanka");
        GeometricObject[] objects = {new Square(7), new Square(5), new Square(6), new Square(2),
            new Square(3.5)};

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Area is " + objects[i].getArea());
            if (objects[i] instanceof Colorable) {
                ((Colorable) objects[i]).howToColor();
            }
        }
    }

}
