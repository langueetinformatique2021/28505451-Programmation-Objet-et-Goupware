package devoir3;

public class Peuplier extends Plantae implements Cultivable{
	private String nom;
	public Peuplier() {
		super("peupliers");
	}
	@Override
	public void cultiver(String nom) {
		cultiver = true;
		this.nom = nom;
	}
	@Override
	public String nom() {
		return this.nom;
	}
	public void genre() {
		if (cultiver == false) super.genre();
		else
			System.out.println("Je suis un arbre et je m'appelle " + this.nom());
	}
}
