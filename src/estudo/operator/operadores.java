package estudo.operator;

import java.util.Scanner;

public class operadores {	
		public static void main(String[] args) {
			System.out.println("Hello");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Olá, informe o seu nome: ");
			String name = scanner.next();
			/*O next ele só lê o o primeiro item antes do espaço
			 * tentei por Emaneul Brito e deu uma erro java.util.InputMismatchException
			 *  java.util.InputMismatchException -> o nextInt só recebe número e isso ocorreu 
			 *  pois após tentar por meu nome é sobrenome o Next() salvou o primeiro item e o 
			 *  onde deu erro, pegar todo item é só usar o nextLine()
			 *  */
			System.out.println("Agora informe a sua idade: ");
			int age = scanner.nextInt();
			System.out.println("Olá " + name + " sua idade é " + age +".");
			System.out.printf("Olá %s sua idade é %s.", name, age);
			//
			scanner.close();
		}
	

}
