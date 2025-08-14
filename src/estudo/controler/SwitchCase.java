package estudo.controler;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um númeor do 1 a 7: ");
		int option = scan.nextInt();		
		
		//switch (option) {
		/*	case 1:
			case 7:
				//System.out.println("Domingo");
				System.out.println("Final de semana uhulll \o/");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
		--	case 7:
				System.out.println("Sábado");
				break;   --
			default:
				System.out.println("Opção Inválida.");	*/	
		
		/* Forma mais enchuta sem nessecidade de break
			case 1 -> System.out.println("Domingo");
			case 2 -> System.out.println("Segunda");
			case 3 -> System.out.println("Terça");
			case 4 -> System.out.println("Quarta");
			case 5 -> System.out.println("Quinta");
			case 6 -> System.out.println("Sexta");
			case 7 -> System.out.println("Sábado");
			default -> System.out.println("Opção inválida.");		
		*/
			
		//}
		
		
		var message  = switch(option) {
			case 1, 7 -> {
				var day = option == 1 ? "Domingo" : "Sábado";
				yield String.format("Hoje é %s final de semana uhulll \\o/", day);
			}
			case 2 -> "Segunda";
			case 3 -> "Terça";
			case 4 -> "Quarta";
			case 5 -> "Quinta";
			case 6 -> "Sexta";
			default -> "Opção inválida.";		

		};
		System.out.println(message);
		
			
		scan.close();
	}

}
