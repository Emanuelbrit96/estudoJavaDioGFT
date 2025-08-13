package estudo.controler;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		/* Como eu fiz 
		Scanner scan = new Scanner(System.in);	
		String name;
		int age;
		System.out.println("Digite seu nome: ");
		name = scan.nextLine();
		System.out.println("Digite sua idade: ");
		age = scan.nextInt();
		
		//como eu fiz		
		if (age < 18) {
			if(age < 16) {
				System.out.printf("%s, você não pode dirigir.\n", name);
			}else {
				System.out.println("Você é emancipado? (s/n)");
				var isEmancipated = scan.next().equalsIgnoreCase("s");
				//equals seria o equevalente ==, IgnoreCase ignorar se é maiusculo ou não
				if(isEmancipated) {
					System.out.printf("%s apesar de ter %s anos, por ser emancipado você pode dirigir. \n", name, age);

				}else System.out.printf("%s, você não pode dirigir.\n", name);				
			}
		}else {
			System.out.printf("%s tem %s anos, e pode dirigir. \n", name, age);
		}
		
		*/
		
		//Melhorias que o chatgpt me propos
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		String name = scan.nextLine();
		
		System.out.println("Digite sua idade: ");
		int age = scan.nextInt();
        // Menores de 16 não podem dirigir

		if(age < 16) {
			System.out.printf("%s, você não pode dirigir", name);
			return;
		}
		
        // Entre 16 e 17, precisa verificar emancipação
		if(age < 18) {
			System.out.println("Você é emancipado?  (s/n)");
			var isEmancipated = scan.next().equalsIgnoreCase("s");
			if(isEmancipated) {
				System.out.printf("%s, apesar de ter %d anos, por ser emancipado você pode dirigir.\n",name, age);
			}else {
                System.out.printf("%s, você não pode dirigir.\n", name);
			}
			return;	
		}		
		 // 18 ou mais, pode dirigir
        System.out.printf("%s tem %d anos e pode dirigir.\n", name, age);
	}

}
