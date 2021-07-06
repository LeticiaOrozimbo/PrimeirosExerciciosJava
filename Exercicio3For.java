package Familia28;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */
public class Exercicio3Para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int idade,menor=0, maior=0,idadegeral=0;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("\nEntre com a sua idade: ");
	idade = leia.nextInt();
	
	while (idade !=-99) {
	System.out.println("\nEntre com a sua idade: ");
	idade = leia.nextInt();
	
	if(idade<21)
	{
		menor++;
	}
	else if(idade>50)	{
		maior++;
	}
	
	}
	System.out.println("\nNúmero de pesssoas com menos de 21 anos: " + menor);
	System.out.println("\nNúmero de pesssoas com mais de 50 anos:: " + maior);
	}
}