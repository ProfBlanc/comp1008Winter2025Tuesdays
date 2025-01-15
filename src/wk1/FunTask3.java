package wk1;

import java.util.Random;
import java.util.Scanner;

public class FunTask3 {

    public static void main(String[] args) {

        int minNum = 1, maxNum = 20, maxUserGuesses = 5, currentUserGuesses = 0,
                numberToGuess = new Random().nextInt(minNum, maxNum + 1),
                whatNumberUserGuessed = 0;
        Scanner input = new Scanner(System.in);

        do{
            currentUserGuesses++;
            if(currentUserGuesses == maxUserGuesses){
                System.out.println("Half of the number to guess is " + (numberToGuess / 2.0 ));
            }

            System.out.printf("Guess a number between %d and %d\n", minNum, maxNum);
            whatNumberUserGuessed = input.nextInt();
            if(whatNumberUserGuessed == numberToGuess){
                System.out.println("Congrats! You correctly guess the number. The number was " + numberToGuess);
            }
            else{
                System.out.printf("Sorry, but %d is NOT the correct number\n", whatNumberUserGuessed);

                if(whatNumberUserGuessed > numberToGuess){
                    System.out.println("The number is lower than " + whatNumberUserGuessed);
                }
                else{
                    System.out.println("The number is higher than " + whatNumberUserGuessed);
                }

            }
        }
        while(currentUserGuesses <= maxUserGuesses || numberToGuess != whatNumberUserGuessed);

    }
}
