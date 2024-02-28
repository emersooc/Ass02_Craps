import java.util.Random;

import java.util.Scanner;

public class Craps
{
    public static void main(String[] args)
    {
        Random rnd = new Random(); //random object
        boolean done = false; //boolean to control while loop
        int die1; //first die
        int die2; //second die
        int crapsRoll; //sum of roll
        int point; //point if no natural or craps roll
        String again = ""; //variable to control play again loop

        do
        {
            die1 = rnd.nextInt(6) + 1; //roll of first die
            die2 = rnd.nextInt(6) + 1; //roll of second die
            crapsRoll = die1 + die2; //combined die roll

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) //tests if roll is craps
            {
                System.out.println("Die 1: " + die1 + "\nDie 2: " + die2 + "\nRoll: " + crapsRoll + "\nCraps! You lose!");
            }
            else if (crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("Die 1: " + die1 + "\nDie 2: " + die2 + "\nRoll: " + crapsRoll + "\nNatural! You win!");
            }
            else
            {
                point = crapsRoll; //assigns roll value to "the point"
                System.out.println("Die 1: " + die1 + "\nDie 2: " + die2 + "\nRoll: " + crapsRoll + "\nSet point! Roll again");

                do
                {
                    die1 = rnd.nextInt(6) + 1; //roll of first die
                    die2 = rnd.nextInt(6) + 1; //roll of second die
                    crapsRoll = die1 + die2; //combined die roll

                    if (crapsRoll == point)
                    {
                        System.out.println("Die 1: " + die1 + "\nDie 2: " + die2 + "\nRoll: " + crapsRoll + "\nPoint! You win!");
                    }
                    else if (crapsRoll == 7)
                    {
                        System.out.println("Die 1: " + die1 + "\nDie 2: " + die2 + "\nRoll: " + crapsRoll + "\n7! You lose!");
                    }
                    else
                    {
                        System.out.println("Die 1: " + die1 + "\nDie 2: " + die2 + "\nRoll: " + crapsRoll + "\nRoll again");
                    }
                }
                while (crapsRoll != point && crapsRoll != 7); //continues loop until win or loss
            }

            Scanner userInput = new Scanner(System.in);
            System.out.println("Would you like to play again?[Y/N] ");

            do
            {
                if (userInput.hasNextLine())
                {
                    again = userInput.nextLine();
                    if (again.equalsIgnoreCase("Y") || again.equalsIgnoreCase("N"))
                    {
                        done = true;
                    }
                    else
                    {
                        System.out.println("Not a valid answer");
                    }
                }
                else
                {
                    System.out.println("Not a valid input");
                }
            }
            while (!done);
        }
        while (again.equalsIgnoreCase("Y"));
    }
}