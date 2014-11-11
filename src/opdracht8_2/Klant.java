package opdracht8_2;

public class Klant {
	private String naam;
	private double kortingsPercentage;
	
	public Klant(String naam) {
		this.naam = naam;
	}
	public void setKorting(double kortingsPercentage) {
		this.kortingsPercentage = kortingsPercentage;
	}
	public double getKorting() {
		return kortingsPercentage;
	}
	public String toString() {
		return naam + "\n" + "korting: " + kortingsPercentage + "%";
	}
}
