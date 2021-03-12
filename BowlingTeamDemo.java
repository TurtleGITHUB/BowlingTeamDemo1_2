// Chapter 8 tutorial 

import java.util.*;
public class BowlingTeamDemo
{
	public static void main(String[] args)
	{
		// variables and constants
		String name;
		BowlingTeam bowlTeam = new BowlingTeam();
		int x;
		final int NUM_TEAM_MEMBERS = 4;
		Scanner input = new Scanner(System.in);

		// input phase
		System.out.print("Please enter team name >> ");
		name = input.nextLine();
		bowlTeam.setTeamName(name);

		// loop to prompt for 4

		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.print("Enter team member's name >> ");
			name = input.nextLine();
			bowlTeam.setMember(x, name);
		}

		//output phase
		System.out.println("\nMembers of team " + bowlTeam.getTeamName());
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.print(bowlTeam.getMember(x) + " ");
		System.out.println();
		}
	}
}