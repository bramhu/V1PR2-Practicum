package opdracht7_1;

public abstract class Vehicle {
	protected int gearNow;
	protected int maxGears;
	
	public Vehicle(int maxGears) {
		this.maxGears = maxGears;
	}
	public int getGearNow() {
		return gearNow;
	}
	public String toString() {
		return "Vehicle met huidige versnelling " + gearNow + " en max: " + maxGears;
	}
	public abstract void accelerate();
	public abstract void slowDown();
}
