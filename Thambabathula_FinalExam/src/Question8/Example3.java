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
import java.io.*;

class ThrowExample {

    void myMethod(int num) throws IOException, ClassNotFoundException {
        if (num == 1) {
            throw new IOException("IOException Occurred");
        } else {
            throw new ClassNotFoundException("ClassNotFoundException");
        }
    }
}

public class Example3 {

    public static void main(String args[]) {
        System.out.println("Answer for question8 : Thambabathula Priyanka");
        try {
            ThrowExample obj = new ThrowExample();
            obj.myMethod(1);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
