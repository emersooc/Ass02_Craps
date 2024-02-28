import java.util.Random;

public class Craps
{
    public static void main(String[] args)
    {
        Random rnd = new Random(); //random object
        int die1 = 0; //first die
        int die2 = 0; //second die
        int crapsRoll = 0; //sum of roll
        int point = 0; //point if no natural or craps roll
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
        }
        while (again.equalsIgnoreCase("Y"));
    }
}