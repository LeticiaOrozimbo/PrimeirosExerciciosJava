package Familia28;

import java.util.Scanner;

public class Exercicio3Array {
	/*
	 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		float [][] valor = new float[3][3];
		int l,c,cont=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		for (l=0;l<3;l++)
		{	
			for (c=0;c<3;c++)
			{
				System.out.println("\nEntre com os números: ");
				valor [l][c]= leia.nextFloat();
				
				if(valor[l][c]>10)
				{
					cont++;
				}
		}
		

		}	
		System.out.println("\nA contagem dos números maiores que 10 é: " + cont);
	}

}
