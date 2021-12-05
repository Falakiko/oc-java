package fr.singe;

public class ColorsArray {

	public static void main(String[] args) {
		// TODO- Déclarez une variable nommée colors qui correspond à un tableau de
		// String de longueur 5
		String[] colors = new String[5];
		// TODO- Remplissez le tableau avec les couleurs demandées
		colors = new String[] { "red", "yellow", "orange", "green", "blue" };
		// TODO- Remplacez 'green' par 'emerald' dans le tableau

		colors[3] = "emerald";
		// Affiche le contenu du tableau
		for (String color : colors) {
			System.out.println(color);
		}
		// Créez un tableau multidimensionnel pour gérer toutes les rangs d'un théâtre
		String[][] myTheatreSeats=new String[30][12];
		// Rang 10, siège 6. N'oubliez pas que l'index commence à 0!
		myTheatreSeats[9][5]="James Logan";
	}
}
