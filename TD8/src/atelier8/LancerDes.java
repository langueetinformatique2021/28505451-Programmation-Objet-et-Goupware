package atelier8;
/**
 * méthode qui simule un lancer de trois dés
 * @author didier
 *
 */
public class LancerDes extends Aleat {public LancerDes() {super(6);}

public TroisDes lancer() 
{TroisDes tire= new TroisDes (super.get(), super.get(), super.get()); return tire;}}