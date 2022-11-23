package boucles;
public class boucleApriori{
	public static void main (String args [])
	{
		String s1 = "azerty";
		String s2 = "ytreza";
		
		int entier1 = 0;
		int entier2 = s2.length()- 1;
		
		if (s1.length() == s2.length())
		{
			while ((entier2 >= 0) && (s1.charAt(entier1) == s2.charAt(entier2))) {
				entier1 ++;
				entier2 --;
			}
			if (entier2 == -1) {
				System.out.println("Mot mirroir");
			}
		}
	}
}