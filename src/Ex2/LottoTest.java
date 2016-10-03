/**
 * @author Mudrak Patel
 * @purpose: Lab assignment 1 for COMP228 (Java programming)
 * */

package Ex2;

//import statements
import java.lang.String;
import javax.swing.*;

public class LottoTest {
    public static void main(String[] args) {

        //Declaring Lotto object
        Lotto L1 = new Lotto();
        String userInputString = JOptionPane.showInputDialog("Enter a number between 3 and 27");
        int userInputInt = Integer.parseInt(userInputString);
        //Looping five times for actual game play
        for(int gameLooper = 0; gameLooper<5; gameLooper++){
            int[] intArray = L1.returnIntArray();
            int sumOfArrayElements = Lotto.sumArrayElements(intArray);

            //Checking the sum of array elements for game conditions
            if(sumOfArrayElements == userInputInt){
                JOptionPane.showMessageDialog(null, "YOU WON!!!", "CONGO!!!", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("CONGRATULATIONS! YOU WON!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "COMPUTER WINS!!!", "OOPS!!!", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Thank you for playing! Better luck next time :)");
            }
        }
    }
}
