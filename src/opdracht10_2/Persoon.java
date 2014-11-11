package opdracht10_2;
import java.util.ArrayList;


public class Persoon {
	private String naam;
	private double budget;
	private ArrayList<Computer> computers = new ArrayList<Computer>();
	
	public Persoon(String naam, double budget) {
		this.naam = naam;
		this.budget = budget;
	}
	
	public boolean koop(Computer c) {
		if (computers.contains(c)) {
			System.out.println(naam + " heeft niet gekocht: " + c.getMerk());
			return false;
		}
		if (bezit(c.getMerk())) {
			System.out.println(naam + " heeft niet gekocht: " + c.getMerk());
			return false;
		}
		if (c.huidigeWaarde() < budget) {
			computers.add(c);
			budget -= c.huidigeWaarde();
			System.out.println(naam + " heeft gekocht: " + c.getMerk());
			return true;
		}
		System.out.println(naam + " heeft niet gekocht: " + c.getMerk());
		return false;
	}
	public boolean bezit(String merk) {
		for (int index = 0; index < computers.size(); index++) {
			if (computers.get(index).getMerk() == merk) {
				return true;
			}
		}
		return false;
	}
	public boolean verkoop(Computer c, Persoon koper) {
		if (computers.contains(c)) {
			if (koper.koop(c)) {
				budget += c.huidigeWaarde();
				computers.remove(c);
				System.out.println("verkoper " + naam + " heeft verkocht " + c.getMerk() + " aan koper " + koper.naam);
				return true;
			}
		}
		System.out.println("verkoper " + naam + " heeft niet verkocht " + c.getMerk() + " aan koper " + koper.naam);
		return false;
	}
	public void verwijder(String merk) {
		if (bezit(merk)) {
			for (int index = 0; index < computers.size(); index++) {
				if (computers.get(index).getMerk() == merk) {
					computers.remove(index);
				}
			}
		}
	}
	public double getBudget() {
		return budget;
	}
	public String toString() {
		String s = naam + " heeft budget: " + budget + " en de bezittingen:\n";
		for (int index = 0; index < computers.size(); index++) {
			s += computers.get(index) + "\n";
		}
		return s;
	}
}
