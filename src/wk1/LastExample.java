package wk1;

import java.util.Scanner;

public class LastExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println(fullName);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter the temperature outside");
        double temperature = input.nextDouble();

        System.out.println("Your name is " + fullName + ". You are " + age + "years old. The temperature outside is " + temperature);
        //string formatting
        //output a string. use placeholder for variables

        //souf+tab

        //%s => string
        //%d => whole number
        //%f => decimal number

        System.out.printf("Your name is %s. You are %d years old. The temperature outside is %.1f degrees celsius",
                fullName, age, temperature);
    }
}
