package opdracht10_1_B;

public class Contact {
	private String voornaam;
	private String achternaam;
	private String email;
	
	public Contact(String voornaam, String achternaam, String email) {
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return voornaam + " " + achternaam + " heeft email-adres: " + email;
	}
}
