package opdracht8_3;

public class Lener {
	private String naam;
	private boolean isKredietWaardig;
	
	public Lener(String naam, boolean isKredietWaardig) {
		this.isKredietWaardig = isKredietWaardig;
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	public boolean getIsKredietWaardig() {
		return isKredietWaardig;
	}
	public void setIsKredietWaardig(boolean isKredietWaardig) {
		this.isKredietWaardig = isKredietWaardig;
	}
	public String toString() {
		if (isKredietWaardig) {
			return naam + " (is wel kredietwaardig)";
		} else if (!isKredietWaardig) {
			return naam + " (is niet kredietwaardig)";
		}
		return "";
	}
}
