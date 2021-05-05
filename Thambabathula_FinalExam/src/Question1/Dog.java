/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Thambabathula priyanka
 */
public class Dog extends Animal{

	   public void sound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
               System.out.println("Answer for question01: Priyanka Thambabathula:");
		Animal obj = new Dog();
		obj.sound();
	   }
}

