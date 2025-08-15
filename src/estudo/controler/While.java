package estudo.controler;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		/*
		while(!name.equalsIgnoreCase("exit")) {
			System.out.println("Digite um nome: ");
			name = scanner.nextLine();
			System.out.println(name);
		}
		
		forma diferente de finalizar um while
		while(true) {
			System.out.println("Digite um nome: ");
			name = scanner.nextLine();
			System.out.println(name);
			
			if(name.equalsIgnoreCase("exit")) break;
		}*/
		
		
		
		do {
			System.out.println("Digite um nome: ");
			name = scanner.nextLine();
			System.out.println(name);
		}while(!name.equalsIgnoreCase("exit"));
		
		
		
		
		
		
		
		
		
		System.out.println("Finish!");
	}

}
