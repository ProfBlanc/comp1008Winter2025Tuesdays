package wk1;


import java.util.Scanner;

public class Conversation {

    //psvm+tab
    public static void main(String[] args) {

        //create a Scanner object => get user input
        Scanner input = new Scanner(System.in);

        //ask someone how their day is going
        System.out.println("How is your day going?");
        //get the person's response
        String response = input.nextLine();
        //repeat their response
        System.out.println("Your response was: " + response);
    }
}
