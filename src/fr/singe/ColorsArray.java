package fr.singe;

public class ColorsArray {

	public static void main(String[] args) {
		// TODO- D�clarez une variable nomm�e colors qui correspond � un tableau de
		// String de longueur 5
		String[] colors = new String[5];
		// TODO- Remplissez le tableau avec les couleurs demand�es
		colors = new String[] { "red", "yellow", "orange", "green", "blue" };
		// TODO- Remplacez 'green' par 'emerald' dans le tableau

		colors[3] = "emerald";
		// Affiche le contenu du tableau
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
