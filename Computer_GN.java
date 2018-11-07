
/**
 * Design and implement an application that plays the rock-paper-scissors 
 * game against the computer. When played between two people, each person 
 * picks one of three options (usually shown by a hand gesture) at the same
 * time, and a winner is determined. In the game, rock beats scissors,
 * scissors beats paper, and paper beats rock. The program should randomly 
 * choose one of the three options (without revealing it), then ask for the
 * user’s selection. At that point, the program reveals both choices and
 * prints a statement indicating that the user won, that the computer won, 
 * or that it was a tie. Keep playing until the user chooses to stop, then 
 * print the number of user wins, losses, and ties.
 *
 * Gabe Nydick
 * 10/3/18
 */

import java.util.Random;

public class Computer_GN
{
    private String rock;
    private String paper;
    private String scissors;
    private String chosen;
    private String [] plays = {"rock","paper","scissors"};
    private Random rand = new Random();
    
    public Computer_GN()
    {
        
    }
    
    public String choice()
    {
        chosen = plays[rand.nextInt(plays.length)];
        return chosen;
    }
    
}
