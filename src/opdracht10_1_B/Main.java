package opdracht10_1_B;
public class Main {
	public static void main(String[] arg) {
		//Het Adresboek-object wordt gemaakt:
		Adresboek a = new Adresboek("Contacten");
		//We voegen nu handmatig een aantal contacten toe zodat het adresboek niet leeg is:
		Contact c1 = new Contact("Jan", "Metdekorteachternaam", "jan@lol.nl");
		Contact c2 = new Contact("Kees", "Hoogtevrees","keeshoogtevrees@hotmail.com");
		Contact c3 = new Contact("Piet", "Kierewiet", "pietisdeman@msn.com");
		a.voegContactToe(c1);
		a.voegContactToe(c2);
		a.voegContactToe(c3); a.voegContactToe(c3);
		//We controleren welke contacten in het adresboek staan:
		System.out.println(a);
		//Deze manier van zoeken is voor gevorderde programmeurs
		String mail = "jan@lol.nl";
		//zoek later ook naar "jan@lal.nl"
		Contact con = a.zoekContact(mail);
		if (con != null) {
			System.out.println("Contactgegevens: " + con);
		} else {
			System.out.println(mail + " staat niet in het adresboek");
		}
		//Nu kunnen we verwijderen:
		a.verwijderContact(con);
		System.out.println("\nDit zijn de gegevens:");
		System.out.println(a);
		System.out.println("In dit adresboek staan " +
		a.aantalContacten() + " contacten");
	}
} 