package estudo.controler;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		 for(;;) {
			 System.out.println("Digite seu nome");
			 String name = scan.nextLine();
			 if(name.equalsIgnoreCase("exit")) break;
			 
			 System.out.println(name);
		 }		
		scan.close();*/
		
		
		for(int i=1; i <= 100; i++) {	
			if(i%2 == 0) continue; //Itens que dividido por 2 = 0 ele simplismente passa.
			System.out.println(i);
		}
	}

}
