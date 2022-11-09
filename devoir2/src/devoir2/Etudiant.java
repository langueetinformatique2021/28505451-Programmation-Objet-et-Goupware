package devoir2;
/**
 * 
 * @author didier
 *
 */

public class Etudiant
{
	public static void main (String args [])
	{
		
	}
	class etudiant{
		
		/*Attributs et leurs types*/
		
		private String Nom, Prenom, Nationalite;
		private int Age, Identifiant;
		private boolean PremiereInscription;
		
		
		/*Constructeurs*/
		
		public etudiant (String N, String NT, String P, int A, int I, boolean PI) {
			
			setNom(N);
			setPrenom(P);
			setNationalite(NT);
			setAge(A);
			setIdentifiant(I);
			setPremiereInscription(PI);
		}
		
		
		/*Methodes*/
		
		public String getNom() {
			return Nom;
		}
		
		public void setNom(String N) {
			this.Nom = Nom;
		}
		
		public String getPrenom() {
			return Prenom;
		}
		public void setPrenom(String P) {
			this.Prenom = Prenom;
		}
		
		public String getNationalite() {
			return Nationalite;
		}
		
		public void setNationalite(String NT) {
			this.Nationalite = Nationalite;
		}
		
		public int getAge() {
			return Age;
		}
		
		public void setAge(int A) {
			this.Age = Age;
		}
		
		public int getIdentifiant() {
			return Identifiant;
		}
		
		public void setIdentifiant(int I) {
			this.Identifiant = Identifiant;
		}
		
		public boolean getPremiereInscription() {
			return PremiereInscription;
		}
		
		public void setPremiereInscription(boolean PI) {
			this.PremiereInscription=PremiereInscription;
		}
		
		
		public String toString() {
			return "Nom : " +Nom+ "Prenom : "+Prenom +", Identifiant : "+Identifiant + "Age : "+Age +"de nationalité : " + Nationalite +"Première Inscription (Oui/Non)" + PremiereInscription;
		}
	}
}