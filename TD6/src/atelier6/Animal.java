package atelier6;
/* Création et gestion d'anmiaux*/
public abstract class Animal{
	private String espèce;
	private int nb_pattes = 0;
	
	/**
	 * Création d'une nouvelle instance de la classe Animal
	 * 
	 * @param type nom de l'espèce 
	 * @param pattes nombres de pattes 
	 */
	public Animal (String type, int pattes) {
		espèce = type;
		nb_pattes = pattes;
	}
	
	/* présentation des caractéristiques de l'animal*/
	public void présente() {
		System.out.println("Je suis un représentant de l'espèce "+ espèce + "et j'ai" + nb_pattes + "pattes");
	}
	
	/** Crie de l'animal**/
	public abstract void crie();
}