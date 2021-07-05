package Familia28;

import java.util.Scanner;

public class Exercicio6Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num=0,media=0,multi=0,soma=0;
	
	Scanner leia = new Scanner(System.in);
	
	do {
		
	System.out.println("\nEntre com um número: ");
	num=leia.nextInt();
	
	if(num % 3==0) {
		soma=soma+num;
		
		multi++;
	
	}
		
	}while(num!=0);
	
	media=soma/multi;
	
	System.out.println("\n A media dos múltiplos de 3 é: " + media);
	}

	}
