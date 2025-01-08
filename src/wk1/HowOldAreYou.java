package wk1;

import java.util.Scanner;

public class HowOldAreYou {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I am 20 years old");
        System.out.print("How old are you?: ");
        int age = input.nextInt();
        System.out.println("I see that you are " + age + " years old");
    }
}
