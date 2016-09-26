package in.ac.kletech.cricket;

import java.util.Scanner;

public class CreatePlayer {
	CricketPlayer[] c=new CricketPlayer[5];
	Scanner scan=new Scanner(System.in);
	void createPlayers()
	{
		c[0]=new CricketPlayer("Dhoni", 50, 5000, 232.5f);
		c[1]=new CricketPlayer("Kohli", 20, 2000, 134.6f);
		c[2]=new CricketPlayer("Raina", 30, 2500, 122f);
		c[3]=new CricketPlayer("AB DeVilliers",60, 9000,255.76f);
		c[4]=new CricketPlayer("Gilchrist", 60, 9999, 266.66f);
	}
	
	void sort()
	{
		CricketPlayer.sortPlayers(c);
	}
	
	void print()
	{
		int i;
		System.out.println("Enter the value of i to display the ith player:");
		i=scan.nextInt();
		CricketPlayer.printPlayers(c, i);
		System.out.println("Sorted player list based on runs:");
		CricketPlayer.printPlayers(c);
	}
}
