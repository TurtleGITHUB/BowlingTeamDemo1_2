// Chapter 8 tutorial 

import java.util.*;
public class BowlingTeamDemo2
{
	public static void main(String[] args)
	{
		// variables and constants
		String name;
		final int NUM_TEAMS = 2;
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		int y;
		int x;
		final int NUM_TEAM_MEMBERS = 4;
		Scanner input = new Scanner(System.in);

		// input phase
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			teams[y] = new BowlingTeam();
			System.out.print("Please enter team name >> ");
			name = input.nextLine();
			teams[y].setTeamName(name);

			// loop to prompt for 4

			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print("Enter team member's name >> ");
				name = input.nextLine();
				teams[y].setMember(x, name);
			}
		}

		//output phase
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			System.out.println("\nMembers of team " + teams[y].getTeamName());
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print(teams[y].getMember(x) + " ");

			}
			System.out.println();
		}
	}
}