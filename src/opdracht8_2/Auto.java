package opdracht8_2;

public class Auto {
	private String type;
	private double prijsPerDag;
	
	public Auto(String type, double prijsPerDag) {
		this.type = type;
		this.prijsPerDag = prijsPerDag;
	}
	public void setPrijsPerDag(double prijsPerDag) {
		this.prijsPerDag = prijsPerDag;
	}
	public double getPrijsPerDag() {
		return prijsPerDag;
	}
	public String toString() {
		return type + " met prijs per dag: " + prijsPerDag;
	}
}
