package atelier8;
/*
 * On propage l'exception avec throws
 * throws : permet de remonter toutes les exceptions reçues
 */
public class Division3 {
	public static void division() throws ArithmeticException{
		int i;
		int j;
		i = 1000;
		do {
			i--;
			j = 1 / i;
		} 
		while (true);
	}
	public static void main (String args []) {
		try {
			division();
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.exit(-1); // interrompre l'exécution du programme 
		}
	}
}
