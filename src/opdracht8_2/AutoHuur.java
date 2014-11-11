package opdracht8_2;

public class AutoHuur {
	private int aantalDagen;
	private Auto auto;
	private Klant klant;
	
	public void setHuurder(Klant klant) {
		this.klant = klant;
	}
	public void setGehuurdeAuto(Auto auto) {
		this.auto = auto;
	}
	public Auto getGehuurdeAuto() {
		return auto;
	}
	public Klant getHuurder() {
		return klant;
	}
	public void setAantalDagen(int aantalDagen) {
		this.aantalDagen = aantalDagen;
	}
	public double totaalPrijs() {
		return auto.getPrijsPerDag() * aantalDagen * (1.0 - klant.getKorting() / 100);
	}
	public String toString() {
		if (auto == null && klant == null) {
			return "er is geen auto bekend\ner is geen huurder bekend" + "\naantal dagen: " + aantalDagen + " en dat kost 0.00";
		} else if (auto == null) {
			return "er is geen auto bekend" + "\n" + klant + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		} else if (klant == null) {
			return auto + "\ner is geen huurder bekend" + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		}
		return auto + "\n" + klant + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
	}
}
