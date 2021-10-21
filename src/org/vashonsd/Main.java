package org.vashonsd;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Ask what word and save the result
        System.out.println("What is your word? ");
        Scanner scan = new Scanner(System.in);
        String theWord = scan.nextLine();
        System.out.println("You typed " + theWord);

        //Ask what number and save the result.
        System.out.println("Which character of " + theWord + " would you like?");
        int number = scan.nextInt();
        System.out.println("Your number is " + number);

        //Print out the character at the given index of the word.
        char result = theWord.charAt(number);
        System.out.println(result);
    }
}
