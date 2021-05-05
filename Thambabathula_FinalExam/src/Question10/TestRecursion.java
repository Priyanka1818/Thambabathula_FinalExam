/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thambabathula Priyanka
 */
public class TestRecursion {

    static List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

    public static void main(String[] args) {
        System.out.println("Answer for question10 : Thambabathula Priyanka");
        System.out.println("Enter element to search: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int index = recSearch(integers, 0, integers.size() - 1, x);
        if (index != -1) {
            System.out.println("Element " + x + " is present at index " + index);
        } else {
            System.out.println("Element " + x + " is not present");
        }
    }

    static int recSearch(List<Integer> integers, int l, int r, int x) {
        if (r < l) {
            return -1;
        }
        if (integers.get(l).equals(x)) {
            return l;
        }
        if (integers.get(r).equals(x)) {
            return r;
        }
        return recSearch(integers, l + 1, r - 1, x);
    }

}
