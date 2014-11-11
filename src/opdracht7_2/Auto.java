package opdracht7_2;

import java.text.NumberFormat;
import java.util.Calendar;


public class Auto extends Goed{
	private String kenteken;
	public Auto(String merk, double nieuwPrijs, int bouwJaar, String kenteken) {
		super(merk, nieuwPrijs, bouwJaar);
		this.kenteken = kenteken;
	}
	
	@Override
	public double huidigeWaarde() {
		int huidigJaar = Calendar.getInstance().get(Calendar.YEAR);
		int aantalJaar = huidigJaar - bouwJaar;
		double huidigePrijs = nieuwPrijs;
		for (int index = 0; index < aantalJaar; index += 1) {
			huidigePrijs *= 0.8;
		}
		return huidigePrijs;
	}
	public String toString() {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		return "Auto " + merk + "; nieuwPrijs: " + nieuwPrijs + "; bouwjaar: " + bouwJaar + "; met huidige waarde: " + nf.format(huidigeWaarde());
	}
}
