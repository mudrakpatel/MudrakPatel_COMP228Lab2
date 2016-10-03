/**
 * @author Mudrak Patel
 * @purpose: Lab assignment 1 for COMP228 (Java programming)
 * */

package Ex3;

public class OverloadingTest {
    public static void main(String[] args) {
        System.out.println("<<Addition method with two integer arguments>>");
        Overloading.addVersion(2,2);
        System.out.println("<<Addition method with 4 integer arguments>>");
        Overloading.addVersion(1, 1, 1, 1);
        System.out.println("<<Addition method with 3 integer argument>>");
        Overloading.addVersion(2, 2, 2);
    }
}
