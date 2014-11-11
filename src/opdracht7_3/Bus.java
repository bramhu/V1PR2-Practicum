package opdracht7_3;

public class Bus extends Vehicle {
	private int aantalStoelen;
	
	public Bus(int maxGears, int aantalStoelen) {
		super(maxGears);
		this.aantalStoelen = aantalStoelen;
	}
	public int getAantalStoelen() {
		return aantalStoelen;
	}
	public String toString() {
		return "Bus met huidige versnelling " + gearNow + " en max: " + maxGears;
	}
	@Override
	public void accelerate() {
		if (gearNow < maxGears) {
			gearNow += 1;
		}
	}

	@Override
	public void slowDown() {
		if (gearNow > 0) {
			gearNow -= 1;
		}		
	}
}
