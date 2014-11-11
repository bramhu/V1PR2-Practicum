package opdracht11_3;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Calendar;


public class Computer implements Serializable {
	private String merk;
	private double aanschafPrijs;
	private int aanschafJaar;
	private String type;
	
	public Computer(String merk, double aanschafPrijs, int aanschafJaar) {
		this.merk = merk;
		this.aanschafPrijs = aanschafPrijs;
		this.aanschafJaar = aanschafJaar;
	}
	public Computer(String merk, double aanschafPrijs, int aanschafJaar, String type) {
		this(merk, aanschafPrijs, aanschafJaar);
		this.type = type;
	}
	
	public String getMerk() {
		return merk;
	}
	
	public double huidigeWaarde() {
		int huidigJaar = Calendar.getInstance().get(Calendar.YEAR);
		int aantalJaar = huidigJaar - aanschafJaar;
		double huidigePrijs = aanschafPrijs;
		for (int index = 0; index < aantalJaar; index += 1) {
			huidigePrijs *= 0.6;
		}
		return huidigePrijs;
	}
	public String toString() {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		return "Computer " + merk + "; aanschafPrijs: " + aanschafPrijs + "; aanschafjaar: " + aanschafJaar + "; met huidige waarde: " + nf.format(huidigeWaarde());
	}
}
