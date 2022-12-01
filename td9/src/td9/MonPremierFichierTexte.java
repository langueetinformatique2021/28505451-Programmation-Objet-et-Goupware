package td9;
/**
 * 
 * @author didier
 * ecrire un fichier texte
 */
import java.io.*;
import util.Keyboard;
public class MonPremierFichierTexte {
	public static void main (String args []) throws IOException {
		String fichier;
		String nomsGroupe;
		System.out.println("Nom du fichier : ");
		
		fichier = Keyboard.getString("Nom du fichier a créer : ");
		PrintWriter exit = new PrintWriter (new FileWriter (fichier));
		System.out.print("nom d'un étudiant : ");
		nomsGroupe = Keyboard.getString("") ;
	}
}
