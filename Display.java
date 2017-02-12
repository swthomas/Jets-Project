package jetspackage;

import java.util.Scanner;

public class Display {

	public static void display(Aeroplane aeroplane[], Pilot pilot[]) {
		Scanner kb = new Scanner(System.in);
		DisplayManager manager = new DisplayManager();
		int choice;

		do {
			System.out.println();
			System.out.println("   Aircraft Menu");
			System.out.println(" -----------------");
			System.out.println("1.-  List Fleet");
			System.out.println("2.-  Fastest Jet");
			System.out.println("3.-  Longest Range");
			System.out.println("4.-  Add Aircraft");
			System.out.println("5.-  List Pilots");
			System.out.println("6.-  Hire Pilot");
			System.out.println("7.-  Exit");

			choice = kb.nextInt();
			System.out.println();

			if (choice < 1 || choice > 8) {
				System.out.print("Not Valid! -- ");
				System.out.println("Choose 1-7: ");
				choice = kb.nextInt();
				System.out.println();

			}

			switch (choice) {

			case 1:
				manager.displayFleet(aeroplane);
				break;

			case 2:
				manager.fastestJet(aeroplane);
				break;

			case 3:
				manager.longestRange(aeroplane);
				break;

			case 4:
				manager.addAircraft(aeroplane, pilot);
				break;

			case 5:
				manager.displayPilots(pilot);
				break;
				
			case 6:
				manager.hirePilot(pilot);
				break;
			}

		} while (choice != 6);

		System.err.println("Exiting Aircraft Display!");
		kb.close();
		System.exit(0);
	}
}
