/**
 * @author Mudrak Patel
 * @purpose: Lab assignment 1 for COMP228 (Java programming)
 * */

package Ex3;

public class Overloading {
    //Class methods

    //addVersion method 1
    public static void addVersion(int num1, int num2){
        int sum = num1 + num2;
        System.out.printf("The addition of two integers is: %3d\n", sum);
    }

    //addVersion method 2
    public static void addVersion(int number1, int number2, int number3, int number4){
        int sum = number1 + number2 + number3 + number4;
        System.out.printf("The addition of 4 integers is: %3d\n", sum);
    }

    //addVersion method 3
    public static void addVersion(int arg1, int arg2, int arg3){
        int sum = arg1 + arg2 + arg3;
        System.out.printf("The addition of 3 integers is: %3d\n", sum);
    }
}
