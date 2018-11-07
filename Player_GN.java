
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
 * Gabe N
 * 10/3/18
 */

import java.util.Scanner;

public class Player_GN
{
    private String [] plays = {"rock","paper","scissors"};
    private String choice;
    private Scanner scan = new Scanner(System.in);
    
    public Player_GN()
    {
    
    }
    
    public String choice ()
    {
        
        choice = "";
        do
        {
            System.out.println("rock, paper or scissors?");
            choice = scan.nextLine();
            
        } while ((choice.equals("scissors") || choice.equals("rock") || choice.equals("paper")) == false);
        return choice;
    }
}
