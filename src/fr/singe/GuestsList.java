package fr.singe;

import java.util.ArrayList;
import java.util.List;

public class GuestsList {

	public static void main(String[] args) {
		// TODO Remplacez ?? par le code correct pour cr?er une liste de type String
		List<String> guests = new ArrayList<String>();

		// TODO Ajoutez Joey, Martin et Marie ? la liste
		guests.add("Joey");
		guests.add("Martin");
		guests.add("Marie");
		// TODO Compl?tez l'instruction en rempla?ant ?? pour afficher la taille de la
		// liste
		System.out.println(guests.size());

		// TODO Remplacez Martin par John dans la liste
		guests.set(1, "John");
		// TODO Retirez Joey de la liste
		guests.remove(0);
		// Affiche le contenu de la liste
		System.out.println("The guests are:");
		for (String guest : guests) {
			System.out.println(guest);

		}

	}
}
