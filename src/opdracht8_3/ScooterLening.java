package opdracht8_3;

public class ScooterLening {
	private int maxAantalMaanden;
	private int aantalMaandenBetaald;
	private double bedragPerMaand;
	private double aanbetaling;
	private Lener lener;
	private Scooter scooter;
	
	public ScooterLening(int maxAantalMaanden, double bedragPerMaand) {
		this.maxAantalMaanden = maxAantalMaanden;
		this.bedragPerMaand = bedragPerMaand;
	}
	public void verwerkMaandBetaling() {
		if (aantalMaandenBetaald < maxAantalMaanden)
			aantalMaandenBetaald += 1;
	}
	public double totNuToeBetaald() {
		return aantalMaandenBetaald * bedragPerMaand + aanbetaling;
	}
	public String toString() {
		if (lener == null) {
			return scooter + "\nDeze lening kost " + bedragPerMaand + " per maand en er is " + aantalMaandenBetaald + " van de " + maxAantalMaanden + " maanden betaald\nDeze lening wordt betaald door: de lener is nog onbekend.";
		} else {
			return scooter + "\nDeze lening kost " + bedragPerMaand + " per maand en er is " + aantalMaandenBetaald + " van de " + maxAantalMaanden + " maanden betaald\nDeze lening wordt betaald door: " + lener;
		}
	}
	public void setHetKarretje(Scooter scooter) {
		this.scooter = scooter;
	}
	public void setDeBetaler(Lener lener) {
		if (lener.getIsKredietWaardig()){
			this.lener = lener;
		} else {
			//System.out.println("(Lener is niet kredietwaardig, dus kan geen lening verstrekken)");
		}
	}
	public void setAanbetaling(double aanbetaling) {
		this.aanbetaling = aanbetaling;
	}
	public Scooter getHetKarretje() {
		return scooter;
	}
	public Lener getDeBetaler() {
		return lener;
	}
	public double getAanbetaling() {
		return aanbetaling;
	}
}
