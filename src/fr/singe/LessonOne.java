package fr.singe;

public class LessonOne {

	public static void main(String[] args) {

		int firstDay = 3;

		// TODO Etape 1 : cr�ez une variable daysInWeek avec une valeur de 7

		int daysInWeek = 7;

		// TODO Etape 2 : ajoutez la valeur de la variable daysInWeek � la variable
		// firstDay, en utilisant un op�rateur raccourci

		firstDay += daysInWeek;

		// TODO Etape 3 : cr�ez une constante num�rique nomm� startingDay avec la
		// nouvelle valeur de la variable firstDay

		final int startingDay = firstDay;

		// Affiche le r�sultat
		System.out.println(
				"There are " + daysInWeek + "days in a week.\nYour starting day in the month is: " + startingDay);
	}

}
