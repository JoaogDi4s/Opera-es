package exercicio_operadores_aritmeicos;

import java.util.Scanner;

public class operacoes_matematicas {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			//primeiro valor
			System.out.println("Insira um número inteiro:");
			float n1 = scan.nextFloat();
				
			//segundo valor
			System.out.println("Insira outro número inteiro:");
			float n2 = scan.nextFloat(); 
				
			//informativo sobre as operações
			System.out.println("\nOperações: \n1- adição \n2- subtração \n3- multiplicação \n4- divisão \n5- resto \n6- +n1 \n7- -n2");
			
				//adição
				System.out.println("\nO resultado é: " + (n1+n2));
				
				//subtração
				System.out.println("\nO resultado é: " + (n1-n2));	  
				
				//multiplicação
				System.out.println("\nO resultado é: " + (n1*n2));	
			
				//divisão
				System.out.println("\nO resultado é: " + (n1/n2));	
				
				//resto
				System.out.println("\nO resultado é: " + (n1%n2));
				
				//n1 positivo
				 if (n1<0) {
					 System.out.println("\nO resultado é: " + (n1*-1));
				 }
				 else if (n1>0) {
					 System.out.println("\nO resultado é: " + (+n1));	
				 }
				 else 
					 System.out.println("\nO seu número é: " + n1);
				 
				 //n2 negativo
				 if (n2>0) {
					 System.out.println("\nO resultado é: " + (-n2));	
				 }
				 else if (n2<0)
					 System.out.println("\nO resultado é: " + (n2));	
				 else 
					 System.out.println("\nO seu número é: " + n2);
			
			
			scan.close();
		}
	}