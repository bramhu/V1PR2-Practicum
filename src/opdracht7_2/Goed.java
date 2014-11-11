package opdracht7_2;

public abstract class Goed {
	protected String merk;
	protected double nieuwPrijs;
	protected int bouwJaar;
	
	public Goed(String merk, double nieuwPrijs, int bouwJaar) {
		this.merk = merk;
		this.nieuwPrijs = nieuwPrijs;
		this.bouwJaar = bouwJaar;
	}
	public abstract double huidigeWaarde();
	public String toString() {
		return "";
	}
}
