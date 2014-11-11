package opdracht7_3;

public class Trein extends Vehicle {
	private boolean ATB_ok;
	
	public Trein(int maxGears, boolean ATB_ok) {
		super(maxGears);
		this.ATB_ok = ATB_ok;
	}
	public void setATB_ok(boolean ATB_ok) {
		this.ATB_ok = ATB_ok;
	}
	public String toString() {
		return "Trein met huidige versnelling " + gearNow + " en max: " + maxGears;
	}
	@Override
	public void accelerate() {
		if (gearNow < maxGears && ATB_ok) {
			gearNow += 1;
		}
	}

	@Override
	public void slowDown() {
		if (gearNow > 0) {
			if (ATB_ok) {
				gearNow -= 1;
			} else if (!ATB_ok) {
				gearNow = 0;
			}
		}
	}
}
