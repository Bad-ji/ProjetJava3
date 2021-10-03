package Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Playbook {
	public static void main(String[] args) {
	menu();	
	Scanner sc = new Scanner(System.in);
	int c = sc.nextInt();
	switch(c) {
	case 1:{
		View("Entrer un nombre");
		int nb = sc.nextInt();
		if(Tools.primaire(nb)) {
			View("ce nombre est premier");
		}
		else {
			View("Ce nombre n'est pas premier");
		}
	}break;
		
	case 2:{
		View("Entrer un nombre");
		int nb = sc.nextInt();
		View("La factorielle est : "+Tools.factorielle(nb));
	}break;
	
	case 3:{
		View("Entrer la quantite de nombre a calculer le pgcd");
		int nb = sc.nextInt();
		int[] tab = new int[nb];
		View("Entrer les nombres");
		for(int i = 0;i<tab.length;i++) {
			tab[i] = sc.nextInt();
		}
		Tools.PGCD(tab);
	}break;
	
	case 4:{
		View("Entrer la quantite de nombre a calculer le ppmc");
		int nb = sc.nextInt();
		int[] tab = new int[nb];
		View("Entrer les nombres");
		for(int i = 0;i<tab.length;i++) {
			tab[i] = sc.nextInt();
		}
		Tools.PPMC(tab);
	}break;
	
	case 5:{
		View("Entrer la quantite de nombre a inserer");
		int nb = sc.nextInt();
		List<Integer> tab = new ArrayList<Integer>();
		View("Entrer les nombres");
		for(int i = 0;i<nb;i++) {
			tab.add(sc.nextInt());
		}
		View("Entrer le nombre a rechercher");
		nb = sc.nextInt();
		if(Tools.RechercheDico(tab,nb)) {
			View("Le nombre se trouve dans le tableau");
		}
		else {
			View("Le nombre ne se trouve pas dans le tableau");
		}
	}
	default:{
		View("Entrer un nombre valide");
	}
	
	}
	}
	
	
	public static void View (String X) {
	System.out.println(X);	
	}
	
	public static void menu(){
		View("1.Primalité d'un nombre");
		View("2.Le factorielle d'un nombre");
		View("3.Calculer le PGCD (n>=2)");
		View("4.Calculer le PPMC(n>=2");
		View("5.Recherche dichotomique");
	}
}
