
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
public class CheckWin_GN
{
    private String winner, result;
    private int [] wins = new int[3]; //index 0 is computer, index 1 is player
    //index 2 is ties

    public CheckWin_GN()
    {
        winner = "";
        result = "";
    }

    public String check(String comp, String plr)
    {
        if (comp.equals("scissors") && plr.equals("scissors"))
        {
            wins[2] += 1;
            System.out.println("Tie");
        }

        if (comp.equals("rock") && plr.equals("rock"))
        {
            wins[2] += 1;
            System.out.println("Tie");
        }

        if (comp.equals("paper") && plr.equals("paper"))
        {
            wins[2] += 1;
            System.out.println("Tie");
        }

        if (comp.equals("scissors") && plr.equals("rock"))
        {
            winner = "Player";
            wins[1] += 1;
            System.out.println("Winner is " + winner);
        }

        if (plr.equals("scissors") && comp.equals("rock"))
        {
            winner = "Computer";
            wins[0] += 1;
            System.out.println("Winner is " + winner);
        }

        if (comp.equals("scissors") && plr.equals("paper"))
        {
            winner = "Computer";
            wins[0] += 1;
            System.out.println("Winner is " + winner);
        }

        if (plr.equals("scissors") && comp.equals("paper"))
        {
            winner = "Player";
            wins[1] += 1;
            System.out.println("Winner is " + winner);
        }

        if (comp.equals("rock") && plr.equals("paper"))
        {
            winner = "Player";
            wins[1] += 1;
            System.out.println("Winner is " + winner);
        }

        if (plr.equals("rock") && comp.equals("paper"))
        {
            winner = "Computer";
            wins[0] += 1;
            System.out.println("Winner is " + winner);
        }

        return winner;
    }

    public String toString()
    {
        result += "Computer Wins: " + wins[0];
        result += "\nPlayer Wins: " + wins[1];
        result += "\nTies: " + wins[2];
        return result;
    }
}
