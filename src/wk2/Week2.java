package wk2;

import java.util.Random;
import java.util.Scanner;

public class Week2 {


    static void version1(){

        //get a random value for noun, verb and noun

        //create arrays for nouns, verbs and nouns
        String[] nouns1 = {"Ben", "Georgian College", "Barrie"};
        //create an array named verbs with vals has, wants, loves
        String[] verbs = {"has","wants","loves"};
        //create an array named nouns2 with vals cars, food, shoes
        String[] nouns2 = {"cars","food","shoes"};

        //create an object from Random class
        Random random = new Random();

        random.nextInt(5);  // a value b/t 0 & 4

        for(int i = 0; i < 5; i++) {
            System.out.printf("%s %s %s\n",
                    nouns1[random.nextInt(nouns1.length)],
                    verbs[random.nextInt(verbs.length)],
                    nouns2[random.nextInt(nouns2.length)]

            );
            System.out.println();
        }
    }
    static void version2(){
        String[] nouns1 = {"Ben", "Georgian College", "Barrie"};
        String[] verbs = {"has","wants","loves"};
        String[] nouns2 = {"cars","food","shoes"};

        //ask the user how many sentences they want to generate

        //ask the user to input an index b/t 0-2
            //get that word in each String[]

        Scanner input = new Scanner(System.in);
        System.out.println("How many sentences do you want to generate?");
        int sentences = input.nextInt();

        for(int i = 0; i < sentences; i++) {

            System.out.println("Enter a number between 0 and 2");
            int number = input.nextInt();
            if(number >= 0 && number <= 2) {
                System.out.printf("%s %s %s\n",
                        nouns1[number], verbs[number],nouns2[number]);
            }
            else{
                System.out.println("Invalid index. Needs to be between 0 and 2");
            }
        }
    }
    //automatically generate 5 sentences iso 1


    static void example3(){

        MathStorm game = new MathStorm();
        game.setOperand1(10);
        game.setOperand2(20);
        game.operator = '+';
        //game.calculate();
        //System.out.println(game.answer);
        System.out.println(game.getAnswer());
    }
    static void example4(){
        MathStorm game1 = new MathStorm();
        System.out.println(game1.incorrectGuesses);
        MathStorm game2 = new MathStorm(5);
        System.out.println(game2.incorrectGuesses);


        game2.setOperand1(10);
        game2.setOperand2(5);
        game2.operator = '+';
        //game2.calculate();
        //game2.answer = 50;
        //System.out.println(game2.answer);
        System.out.println(game2.getAnswer());

        game2.setOperator('a');
        System.out.println(game2.getAnswer());
    }
    public static void main(String[] args) {
        //version2();
        //System.out.println(new Random().nextInt(5, 10));
        example4();
    }

}
