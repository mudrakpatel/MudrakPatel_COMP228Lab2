/**
 * @author Mudrak Patel
 * @purpose: Lab assignment 1 for COMP228 (Java programming)
 * */

package Ex2;

//Import statements
import java.security.SecureRandom;

 class Lotto {
     //Declare members
    public int[] IntArray = new int[2];

     //constructors and methods
     public Lotto(){

     }
     //Other methods

     //randomFill method
     public int randomFill(){
         SecureRandom randomNumberElement = new SecureRandom();
         int randomNumber = randomNumberElement.nextInt(9) + 1;
         return randomNumber;
     }

     //returnIntArray method
        public int[] returnIntArray(){
            for(int counter = 0; counter<IntArray.length; counter++){
                IntArray[counter] = randomFill();
            }
            return IntArray;
        }

        //sumArrayElements method
            public static int sumArrayElements(int[] argumentArray){
                int sumOfArrayElements=0;
                for(int counter : argumentArray){
                    sumOfArrayElements += counter;
                }
                return sumOfArrayElements;
            }
 }

