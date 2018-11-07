
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

import java.util.Scanner;

public class RockPaperScissors_GN
{
    public static void main(String[]args)
    {
        Computer_GN comp = new Computer_GN();
        Player_GN plr = new Player_GN();
        CheckWin_GN checkWin = new CheckWin_GN();
        Scanner scan = new Scanner(System.in);

        String compPlay, plrPlay;
        String cont = "y";

        while (cont.equals("y"))
        {
            compPlay = comp.choice();            
            plrPlay = plr.choice();

            System.out.println("player: " + plrPlay);
            System.out.println("computer: " + compPlay + "\n");
            
            checkWin.check(compPlay, plrPlay);
            System.out.println("Do you want to play again? (y/n)");
            cont = scan.nextLine();
        }
        
        System.out.println(checkWin);
    }
}

/*
 * rock, paper or scissors?
paper
player: paper
computer: rock

Winner is Player
Do you want to play again? (y/n)
y
rock, paper or scissors?
rock
player: rock
computer: scissors

Winner is Player
Do you want to play again? (y/n)
y
rock, paper or scissors?
rock
player: rock
computer: scissors

Winner is Player
Do you want to play again? (y/n)
y
rock, paper or scissors?
rock
player: rock
computer: rock

Tie
Do you want to play again? (y/n)
y
rock, paper or scissors?
paper
player: paper
computer: scissors

Winner is Computer
Do you want to play again? (y/n)
n
Computer Wins: 1
Player Wins: 3
Ties: 1
 */