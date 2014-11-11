package opdracht7_3;

public abstract class Vehicle implements Movable{
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
}
