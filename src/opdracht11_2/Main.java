package opdracht11_2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	private static Double factor = 0.712809; // TODO lookup factor
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("prices_usd.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("prices_euro.txt");
			PrintWriter pw = new PrintWriter(fw);
			while (true) {
				String s = br.readLine();
				
				if (s == null)
					break;
				
				int start = s.indexOf(" : ") + 3; // Our value starts after the ' : ', which is 3 char long
				int end = s.length();
				Double price_usd = Double.parseDouble(s.substring(start, end));
				Double price_eur = price_usd * factor;
				String s2 = s.substring(0, start);
				pw.print(s2 + String.format("%.2f", price_eur) + "\n");
				System.out.println(s2 + price_eur);
			}
			pw.close();
			br.close();
		} catch (Exception e) { e.printStackTrace(); }
	}
} 