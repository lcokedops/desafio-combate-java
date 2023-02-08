package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Champion champion1, champion2;

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		System.out.println();
		
		champion1 = new Champion(name, life, attack, armor);
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();

		champion2 = new Champion(name, life, attack, armor);

		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turns = sc.nextInt();

		for (int i = 0; i < turns; i++) {

			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			System.out.println();
			System.out.println("Resultado do turno " + (i + 1));
			System.out.println(champion1.status()); 
			System.out.println(champion2.status());
			if (champion1.getLife() == 0 || champion2.getLife() == 0) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();
	}

}
