package opdracht8_3;

public class Scooter {
	private String merk;
	private double nieuwPrijs;
	
	public Scooter(String merk, double nieuwPrijs) {
		this.merk = merk;
		this.nieuwPrijs = nieuwPrijs;
	}
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public double getNieuwPrijs() {
		return nieuwPrijs;
	}
	public void setNieuwPrijs(double nieuwPrijs) {
		this.nieuwPrijs = nieuwPrijs;
	}
	public String toString() {
		return "Deze " + merk + " kost " + nieuwPrijs + "(aanschafprijs).";
	}
}
