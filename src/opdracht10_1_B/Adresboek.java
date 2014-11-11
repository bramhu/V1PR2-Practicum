package opdracht10_1_B;
import java.util.ArrayList;


public class Adresboek {
	private String naam;
	private ArrayList<Contact> contacten = new ArrayList<Contact>();
	
	public Adresboek(String naam) {
		this.naam = naam;
	}
	public void voegContactToe(Contact c) {
		if (heeftContact(c) == false) {
			contacten.add(c);	
		}
	}
	public boolean heeftContact(Contact c) {
		return contacten.contains(c);
	}
	public Contact zoekContact(String email) {
		for (int index = 0; index < contacten.size(); index++) {
			if (contacten.get(index).getEmail() == email)
				return contacten.get(index);
		}
		return null;
	}
	public void verwijderContact(Contact c) {
		contacten.remove(c);
	}
	public int aantalContacten() {
		return contacten.size();
	}
	public String toString() {
		String s = "Het aantal contacten is: " + aantalContacten() + "\nDeze contacten zijn: \n";
		for (int index = 0; index < aantalContacten(); index++) {
			s += contacten.get(index) + "\n";
		}
		return s;
	}
}
