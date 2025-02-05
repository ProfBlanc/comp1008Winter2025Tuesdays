package wk5;

import crazy_eight.Card;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Week5 {

    public static void main(String[] args) {

        ArrayList<Card> deck = Card.CreateDeck();

        Random random = new Random();

        Card randomCard = deck.get(random.nextInt(deck.size()));

        System.out.println(randomCard);
        System.out.println(randomCard.getFaceValue());
        System.out.println(randomCard.getSuit());


    }


    static void example1(){
        ToDoList list = new ToDoList();
        list.addTask("code1");
        list.addTask("remove snow");
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of tasks: ");
            int tasks = sc.nextInt();

            list.updateTask("code", "do homework");
            System.out.println("Hi");
        }
        //catch (IllegalArgumentException | InputMismatchException e){
        catch (IllegalArgumentException e){
            //serr+tab
            System.err.println(e.getClass().getSimpleName());
            System.err.println(e.getMessage());

        }
        catch (InputMismatchException e){
            System.err.println("Invalid number");
        }

    }
}
