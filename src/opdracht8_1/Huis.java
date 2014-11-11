package opdracht8_1;

public class Huis {
	private String adres;
	private int bouwJaar;
	private Persoon huisbaas;
	
	public Huis(String adres, int bouwJaar) {
		this.adres = adres;
		this.bouwJaar = bouwJaar;
	}
	public void setHuisbaas(Persoon huisbaas) {
		this.huisbaas = huisbaas;
	}
	public Persoon getHuisbaas() {
		return huisbaas;
	}
	public String toString() {
		return adres + " is gebouwd in " + bouwJaar + "\n en heeft huisbaas " + huisbaas;
	}
}
