package atelier6;
public class Chat extends Felin implements Domesticable{
	private String nom;
	public Chat() {
		super("Chats");
	}
	@Override
	public void domestiquer(String nom)
	{domestique = true; this.nom = nom;}
	@Override
	public String nom()
	{return this.nom;}
	
	public void crie() {
		if (domestique == false) super.crie();
		else
			System.out.println("Je miaule et je m'appelle" + this.nom());
	}
}