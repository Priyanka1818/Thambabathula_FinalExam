/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Thambabathula Priyanka
 */
public class CheckedException {

    public static void main(String args[]) {
        FileInputStream fis = null;
        System.out.println("Answer for question6_1 : Thambabathula Priyanka");
        try {
            fis = new FileInputStream("B:/myfile.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("The specified file is not "
                    + "present at the given path");
        }
        int k;
        try {
            while ((k = fis.read()) != 1) {
                System.out.print((char) k);
            }
            fis.close();
        } catch (IOException ioe) {
            System.out.println("I/O error occurred: " + ioe);
        }
    }
}
