// Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares//

package exercicios;

import java.util.Scanner;

public class QtdNumerosPares {

	public static void main(String[] args) {

		int pares = 0;
		int impares = 0;
		int numero;

		Scanner leia = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			System.out.print("Digite o " + i + "º número: " );
			numero = leia.nextInt();

			if (numero % 2 == 0 ) {

				pares++;

			}else 
			{
				impares++;
			}
		}

		System.out.println("\nTotal de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);



	}

}
