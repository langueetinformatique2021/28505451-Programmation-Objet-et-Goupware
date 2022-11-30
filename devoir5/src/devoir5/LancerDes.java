package devoir5;
import java.util.ArrayList;
import devoir5.E421;
public class LancerDes extends Aleat {
	/**
	 * @author didier
	 * simulation d'un lancer de dés
	 * 
	 */
	 
	public LancerDes(String nom, int faces)
	{super(faces);this.nom = nom; this.faces = faces;}
	
	public void affiche() {System.out.print("nom du lanceur : " + nom);}
	
	String nom = "lanceur"; // nom du lanceur 
	int faces = 6; // nombre de faces du dé 

		
	class E421 extends Exception {}
	
	public ArrayList<Integer> lancerDes() throws E421 {
		ArrayList<Integer> nb = new ArrayList<>();
		int i;
		i = 0;
		do {
			i++; nb.add(this.get());} while (i < 3); this.test(nb, nom); return nb;
	}
	
	private void test (ArrayList <Integer> liste, String nom) 
	{
		
	}
}