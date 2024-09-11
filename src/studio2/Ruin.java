package studio2;

import java.util.Scanner;

import java.util.Random;
public class Ruin {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting amount of money: ");
		int startAmount = in.nextInt();
		System.out.print("Enter win chance: ");
		double winChance = in.nextDouble();
		System.out.print("Enter win limit: ");
		int winLimit = in.nextInt();
		System.out.print("Enter Number of Days: ");
		int totalSimulations = in.nextInt();
		int numPlays = 0;
		if (winChance == 0.5) {
		double expectedRuinRate = 1 - (startAmount/winLimit); }
		else {
		expectedRuinRate = Math.pow((1-winChance)/(winChance),startAmount);
		}

		
		for (int i = 1; i<=totalSimulations; i++) {		
			System.out.println("Simulation Day: " + i);
			while (startAmount > 0 && startAmount < winLimit ) {
				int y = (int) (100 * winChance);
				int x = rand.nextInt(100);
				if (x <= y) {
					startAmount += 1; }
				else {
					startAmount -= 1;}
				numPlays += 1; }
				if (startAmount == winLimit) {
					System.out.println("Day " + i + " ended in success");
				} else {
				System.out.println("Day " + i + " ended in ruin"); }
				System.out.println("Number of plays: " + numPlays);
			}
		}
	}


