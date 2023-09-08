package Programas;

import java.util.Scanner;

public class Calculadora {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcaoEscolhida;
			
		
				while (true) {
					System.out.println("Calculadora básica em Java 1.0");
					
					System.out.println("Menu Principal");
					System.out.println("1 - Adição");
					System.out.println("2 - Subtração");
					System.out.println("3 - Multiplicação");
					System.out.println("4 - Divisão");
					
					System.out.println();
					
					System.out.println("Escolha uma opção: ");
					opcaoEscolhida = sc.nextInt();
					
					
					
				switch (opcaoEscolhida) {
				case 1:
					int n1, n2;
					
					System.out.println("Digite um número: ");
					n1 = sc.nextInt();
					System.out.println("Digite outro número: ");
					n2 = sc.nextInt();
					
					int resultado = n1 + n2;
					System.out.println("Resultado da Soma: " + resultado);
					System.out.println();
					break;
					
				case 2:
					System.out.println("Digite um número para subtrair: ");
					n1 = sc.nextInt();
					System.out.println("Digite outro número: ");
					n2 = sc.nextInt();
					
					resultado = n1 - n2;
					System.out.printf("%d, Menos %d, É igual á: %d ", n1, n2, resultado);
					System.out.println();
					break;
				case 3:
					System.out.println("Digite um número para Multiplicação: ");
					n1 = sc.nextInt();
					System.out.println("Digite outro número para Multiplicar: ");
					n2 = sc.nextInt();
					resultado = n1 * n2;
					System.out.printf("%dx%d, é igual á: %d", n1, n2, resultado);
					System.out.println();
					break;
				case 4:
					System.out.println("Digite um número a ser dividido: ");
					n1 = sc.nextInt();
					System.out.println("Digite outro número a ser dividido: ");
					n2 = sc.nextInt();
					resultado = n1 / n2;
					System.out.printf("%d Dividido por %d, é igual á: %d", n1, n2, resultado);
					System.out.println();
					break;
					

					
					default:
						System.out.println("Não reconheci os dados Informados, por favor tente novamente!");
						break;
						
				
				}
			}
				
				
			//Teste
			
				
   }
}
