/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author thambabathula priyanka
 */
public class TestEqual {

    public String studentName;
    public int studentId;

    TestEqual(String studentName, int studentId) {

        this.studentName = studentName;
        this.studentId = studentId;
    }

    @Override
    public int hashCode() {

        // returning the studentId as a hashcode value.
        return studentId;
    }

    @Override
    public boolean equals(Object obj) {

        // checking if both the object references are referring to the same object.
        if (this == obj) {
            return true;
        }

        // it checks if the object references is the instanceof the TestEqual class.
        if (!(obj instanceof TestEqual)) {
            return false;
        }

        // type casting of the argument.
        TestEqual other = (TestEqual) obj;

        // comparing the state of argument with the state of 'this' Object.
        return (other.studentName == this.studentName && other.studentId == this.studentId);

    }

    public static void main(String[] args) {

        // creating the Objects of TestEqual class.
        TestEqual t1 = new TestEqual("ab", 1);
        TestEqual t2 = new TestEqual("aa", 1);

        // comparing above created Objects.
        System.out.println("Answer for question11 : Thambabathula Priyanka");
        if (t1.hashCode() == t2.hashCode()) {

            if (t1.equals(t2)) {
                System.out.println("Both Objects are equal. ");
            } else {
                System.out.println("Both Objects are not equal. ");
            }

        } else {
            System.out.println("Both Objects are not equal. ");
        }
    }

}
