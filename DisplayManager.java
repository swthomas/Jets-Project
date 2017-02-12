package jetspackage;
import java.util.Scanner;

public class DisplayManager {
	Scanner kb = new Scanner(System.in);
	TakeOff takeoff = new TakeOff();


	void displayFleet(Aeroplane aeroplane[]) {
		for (int i = 0; i < aeroplane.length; i++) {
			if (aeroplane[i] != null) {
				System.out.println(aeroplane[i]);
				System.out.println();
			}
		}
	}

	void fastestJet(Aeroplane aeroplane[]) {

		Aeroplane a1 = aeroplane[0];
		for (int i = 0; i < aeroplane.length; i++) {
			if (aeroplane[i] != null) {
				if (aeroplane[i].getTopSpeed() > a1.getTopSpeed()) {
					a1 = aeroplane[i];
				}
			}
		}
		System.out.println(a1);
		System.out.println();
		System.out.println("Take her for a spin? 1 yes - 2 no");
		int choice = kb.nextInt();
		if(choice == 1)
			takeoff.inFlight12();
	}

	void longestRange(Aeroplane aeroplane[]) {
		Aeroplane r1 = aeroplane[0];
		for (int i = 0; i < aeroplane.length; i++) {
			if (aeroplane[i] != null) {
				if (aeroplane[i].getRange() > r1.getRange()) {
					r1 = aeroplane[i];
				}
			}
		}
		System.out.println(r1);
		
	}
	
	void addAircraft(Aeroplane aeroplane[], Pilot pilot[]) {

		for (int i = 0; i < aeroplane.length; i++) {
			
			if (aeroplane[i] == null) {
				System.out.println();
				System.out.print("Aircraft Make: ");
				String model = kb.next();
				System.out.print("Aircraft Model: ");
				String make = kb.next();
				System.out.print("Top Speed: ");
				double topSpeed = kb.nextDouble();
				System.out.print("Wingspan: ");
				int wingspan = kb.nextInt();
				System.out.print("Length: ");
				int length = kb.nextInt();
				System.out.print("Range: ");
				int range = kb.nextInt();
				System.out.print("Price: ");
				int price = kb.nextInt();
			
				aeroplane[i] = new Aeroplane(model, make, topSpeed, range, price, pilot[((int)(Math.random() * 9))], wingspan, length);
				break;
			}
		}

	}

	void hirePilot(Pilot pilot[]) {

		for (int i = 0; i < pilot.length; i++) {
			if (pilot[i] == null) {
				System.out.print("Name: ");
				String name = kb.next();
				System.out.print("Age: ");
				int age = kb.nextInt();
				System.out.print("Experience: ");
				int expYear = kb.nextInt();
				pilot[i] = new Pilot(name, age, expYear);
				break;
			}
		}
	}
	
	void displayPilots(Pilot pilot[]) {
		for (int i = 0; i < pilot.length; i++) {
			if (pilot[i] != null) {
				System.out.println(pilot[i]);
				System.out.println();
			}
		}
	}
}
