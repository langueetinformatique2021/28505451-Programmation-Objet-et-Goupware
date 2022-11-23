package atelier6;
public class Felin extends Animal {
	// ajout d'attributs propres à la sous-classe 
	protected boolean domestique = false;
	
	/*
	 * le constructeur de Félins fait appel au constructeur de la sur-classe Animal
	 */
	
	public Felin(String type) {
		super(type, 4);
	}
	/** présentation des caractéristiques du félin*/
	public void présente() {
		// appel de la méthode de la sur-classe
		super.présente();
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("je suis vraiment un animal" + etat);
		
	}
	/** cri du félin*/
	public void crie() {
		System.out.println("je rugis");
	}
}