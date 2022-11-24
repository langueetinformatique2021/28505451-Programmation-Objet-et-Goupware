package devoir4;
/**
 * 
 * @author didier
 * création d'une figure géométriquue avec une méthode abstraite
 */
public abstract class FigureMetrique {protected String couleur ="noir";
/**
 * création d'une nouvelle instance de la classe FigureGeometrique
 */
public FigureMetrique (String co) {couleur = co;} 

/**
 * périmètre d'une figure géométrique
 * @return périmètre
 */
public abstract float perimetre();
/*
 * surface d'une figure géométrique
 */
public abstract float surface();
}
