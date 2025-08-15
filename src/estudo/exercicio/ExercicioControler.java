package estudo.exercicio;

import java.util.Scanner;

public class ExercicioControler {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor bruto do salário: ");
		float salaryValue = scan.nextFloat();
		System.out.println("Digite o valor adicional do beneficios: ");
		float benefitValue = scan.nextFloat();
		float taxValue = 0;
		
		if(salaryValue >= 0 && salaryValue <=1100) {
			taxValue = 0.05F * salaryValue;
		}else if(salaryValue < 2500){
			taxValue = 0.1F * salaryValue;
		}else {
			taxValue = 0.15F * salaryValue;
		}
		
		float output = salaryValue - taxValue + benefitValue;
		System.out.println(String.format("%.2f", output));		
		scan.close();
	}	
}



