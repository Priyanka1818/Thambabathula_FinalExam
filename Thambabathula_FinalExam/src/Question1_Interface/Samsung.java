/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1_Interface;

/**
 *
 * @author Thambabathula priyanka
 */
public class Samsung implements Mobile {

    public void calling() {
        System.out.println(" This mobile has calling feature ");

    }

    public void texting() {
        System.out.println(" This mobile has texting feature ");

    }

    public void camera() {
        System.out.println(" This mobile has camera feature ");

    }

    public static void main(String[] args) {

        System.out.println("Answer for question01_Interface: Thambabathula Priyanka");
        Mobile mobile = new Samsung();
        mobile.calling();
        mobile.texting();
        mobile.camera();

    }

}
