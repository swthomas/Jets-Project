package jetspackage;

public class Aeroplane {
	private String model;
	private String make;
	private double topSpeed;
	private int range;
	private int length;
	private int wingspan;
	private int price;
	private Pilot pilot;
	
	Aeroplane(String model, String make, double topSpeed, int range, int price, Pilot pilot, int wingspan, int length){
		this.model = model;
		this.make = make;
		this.topSpeed = ( 0.001303 * topSpeed);
		this.range = range;
		this.length = length;
		this.wingspan = wingspan;
		this.price = price;
		this.pilot = pilot;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n");
		builder.append("Aircraft Make:        ");
		builder.append(model);
		builder.append("\nAircraft Model:       ");
		builder.append(make);
		builder.append("\nTop Speed:            ");
		builder.append("Mach " + topSpeed);
		builder.append("\nRange:                ");
		builder.append(range);
		builder.append("\nWingspan: ");
		builder.append(wingspan);
		builder.append("\nLength: ");
		builder.append(length);
		builder.append("\nPrice:                ");
		builder.append("$ " + price + ".00");
		builder.append("\n----------------------------");
		builder.append("\nPilot:                ");
		builder.append(pilot);
		return builder.toString();
		
	}






	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		
		this.topSpeed = ( 0.001303 * topSpeed);
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}


	
	
	
	
}


