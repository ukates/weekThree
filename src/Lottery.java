/*
    Derick Cates
    CIS 402A 305J
    Assignment 3.1
    Lottery.java

    The purpose of this program is to generate four random numbers between 0
    and 9 and have the user guess the four numbers.  After the user has made
    their guesses, we will check to see how many numbers were correct and
    display a total of points depending on the number correct.
 */
//import random
import java.util.Random;
//import scanner
import java.util.Scanner;
//Lottery class
public class Lottery {
    //main method
    public static void main(String[] args){
        //create instance of random class
        Random rand = new Random();
        //create instance of scanner class
        Scanner input = new Scanner(System.in);
        //number correct
        int numCorrect = 0;
        //array for lotto number
        int[] lottoNum =new int [4];
        //array for user input
        int[] userInput = new int [4];
        //array for original user guess
        int[] userGuess = new int [4];
        //loop through lotto array and assign random number to each index
        for(int x = 0; x < lottoNum.length; x++){
            lottoNum[x] = rand.nextInt(10);
        }
        //loop through user input array and assign guess to each index
        for(int x = 0; x < userInput.length; x++) {
            System.out.print("Please Guess a number: ");
            userInput[x] = input.nextInt();
            userGuess[x] = userInput[x];
        }
        //for each value in lotto array, check if user input matches
        for (int value : lottoNum) {
            for (int y = 0; y < userInput.length; y++) {
                if (value == userInput[y]) {
                    //if value matches add to number correct
                    numCorrect++;
                    //change number so it is not counted twice
                    userInput[y] = 11;
                    //break
                    break;
                }
            }
        }
        //display lotto number
        System.out.println("\nThe lotto number was: ");
        //for each to display
        for (int i : lottoNum) {
            System.out.print(i);
        }
        //display user guess
        System.out.println("\n\nYour number was: ");

        for (int i : userGuess) {
            System.out.print(i);
        }
        //display how many are correct and what was scored
        System.out.print("\n\nYou got " + numCorrect + " correct and scored ");
        //switch statement to display points
        switch(numCorrect) {
            case 4: System.out.print("1,000,000 points!");
            break;
            case 3: System.out.print("2,000 points!");
            break;
            case 2: System.out.print("100 points!");
            break;
            case 1: System.out.print("5 points!");
            break;
            case 0: System.out.print("0 points!");
        }
    }
}