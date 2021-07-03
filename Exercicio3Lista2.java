package Familia28;

import java.util.Scanner;

public class Exercicio3Lista2 {
	/*
	 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\n"+idade+ "Categoria Infatil!!");
		}
		else if (idade>=15 && idade<=14)
		{
			System.out.println("\n"+idade+ "Categoria Juvenil!!");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("\n"+idade+ "Categoria Adulto!!");
		}
		else
		{
			System.out.println("\n"+ idade+ "Idade fora da Categoria!!");
		}
	}

}
