package wk5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Week5 {

    public static void main(String[] args) {

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
