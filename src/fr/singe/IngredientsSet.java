package fr.singe;

import java.util.HashSet;
import java.util.Set;

public class IngredientsSet {

	public static void main(String[] args) {
		Set<String> ingredients = new HashSet<>();
		ingredients.add("sugar");
		ingredients.add("chocolate");
		ingredients.add("butter");
		ingredients.add("vanilla");

		// TODO Ajoutez un autre ingrédient à l'ensemble
		ingredients.add("milk");
		// TODO Supprimez la vanille
		ingredients.remove("vanilla");
		// Affiche le résultat de l'ensemble
		System.out.println("Here is our ingredients list");
		for (String ingredient : ingredients) {
			System.out.println(ingredient);
		}

	}

}
