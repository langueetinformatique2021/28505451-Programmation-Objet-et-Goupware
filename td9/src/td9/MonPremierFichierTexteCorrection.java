package td9;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class MonPremierFichierTexteCorrection {

	public static void main(String[] args) {

		try {
			PrintWriter pr = new PrintWriter(new File("Nom.txt"));
			pr.println("Victoria Eyrabide");
			pr.println("Claude Montacié");
			pr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
