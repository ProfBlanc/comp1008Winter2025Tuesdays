package wk2;

import java.time.LocalDate;
import java.util.Scanner;

public class FunTask2 {
    public static void main(String[] args) {

        int currentYear = 2025;
        int currentYearDynamic = LocalDate.now().getYear();

        System.out.println(currentYearDynamic);
        System.out.println(currentYear);

        System.out.println("Enter your birth year");
        int birthYear = new Scanner(System.in).nextInt();

        if(birthYear > currentYear) {
            System.out.println("No way, man! You weren't born in " + birthYear);
        }
        else{
            System.out.println("Your age in years is " + (currentYear - birthYear));
            System.out.println("Your age in months is " + (currentYear - birthYear) * 12);
            System.out.println("Your age in days is " + (currentYear - birthYear) * 365.25);
        }

    }
}
