package jetspackage;

public class Pilot {
	
	String name;
	int age;
	int yearsExp;
	
	Pilot(String name, int age, int yearsExp) {
		this.age = age;
		this.name = name;
		this.yearsExp = yearsExp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append("\nAge:                  ");
		builder.append(age);
		builder.append("\nYears Experience:     ");
		builder.append(yearsExp);
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYearsExp() {
		return yearsExp;
	}

	public void setYearsExp(int yearsExp) {
		this.yearsExp = yearsExp;
	}

	
	
	
}