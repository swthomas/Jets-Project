package jetspackage;

public class AircratMain {
	Display display = new Display();
	static Aeroplane[] aeroplane = new Aeroplane[10];
	static Pilot[] pilot = new Pilot[20];

	public static void main(String[] args) {

		load();
		Display.display(aeroplane, pilot);

	}

	public static void load() {
		
		pilot[0] = new Pilot("George Lucas", 56, 24);
		pilot[1] = new Pilot("George Washington", 25, 1);
		pilot[2] = new Pilot("George Clooney", 32, 9);
		pilot[3] = new Pilot("George V", 156, 54);
		pilot[4] = new Pilot("George Bush", 45, 12);
		pilot[5] = new Pilot("George Senior", 6, 2);
		pilot[6] = new Pilot("George of the Jungle", 101, 25);
		pilot[7] = new Pilot("Curious George", 38, 19);
		pilot[8] = new Pilot("George the Grand", 16, 1);
		pilot[9] = new Pilot("George Nobody", 25, 3);

		aeroplane[0] = new Aeroplane("Boeing", "747-300", 595, 6691, 83000000, pilot[((int)(Math.random() * 9))], 197, 232);
		aeroplane[1] = new Aeroplane("Boeing", "787 Dreamliner", 593, 9438, 265000000, pilot[((int)(Math.random() * 9))], 197, 206);
		aeroplane[2] = new Aeroplane("Boeing", "767", 529, 6385, 160200000, pilot[((int)(Math.random() * 9))], 156, 201);
		aeroplane[3] = new Aeroplane("Boeing", "777", 590, 8555, 315000000, pilot[((int)(Math.random() * 9))], 212, 242);
		aeroplane[4] = new Aeroplane("Boeing", "247", 200, 745, 65000, pilot[((int)(Math.random() * 9))], 74, 51);
		
	}

}
