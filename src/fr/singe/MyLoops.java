package fr.singe;

public class MyLoops {

	public static void main(String[] args) {
		// TODO: Créez une boucle "for" qui affiche la phrase "I am having so much fun!"
		// 5 fois
		for (int i = 0; i < 5; i++) {
			System.out.println("I am having so much fun!");
		}
		// Boucle "While"
		int fun = 0;
		while (fun < 5) {
			if (fun == 4) {
				fun += 1;
				continue;
			}
			System.out.println("I am having so much fun num2!");
			fun += 1;
		}
		// Boucle "do/while"
		int fun2 = 0;
		do {
			System.out.println("I am having so much fun num3");
			fun2 += 1;
		} while (fun2 < 5);
	}
}
