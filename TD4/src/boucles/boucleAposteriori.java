package boucles;
public class boucleAposteriori{
	public static void main (String args [])
	{
		String s1 = "azerty";
		String s2 = "ytreza";
		
		int entier1 = 0;
		int entier2 = s2.length() -1;
		
		char c1;
		char c2;
		
		if (s1.length() == s2.length()) {
			do
			{
				c1 = s1.charAt(entier1);
				c2 = s2.charAt(entier2);
				entier1++;
				entier2--;
			}
			while ((entier2 >= 0) && (c1 == c2));
			if (entier2 == -1) {
				System.out.println("Mot mirroir");
			}
		}
	}
}