package atelier6;
public abstract class Vegetal
{
	private String espèce;
	private int nb_espèces = 0;
	
	public Vegetal(String type, int nb_espèces)
	{espèce = type; nb_espèces = nb_espèces;}
	
	/** caractéristiques de l'arbre*/
	public void présente() {
		System.out.println("Je suis un représentant de l'espèce" + espèce + "j'ai" + nb_espèces + "espèces");
	}
	/** genre de l'espèce */
	public abstract void genre();
}