package LacosDeRepeticao;

import java.util.Scanner;

public class CamadaRepeticaoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade , cont21 = 0, cont50 = 0;
		
		System.out.println("Digite uma idade:");
		idade = sc.nextInt();
		
		while(idade >= 0) { 
	         
	         if(idade < 21) { 
	            cont21++;
	         }
	         else if(idade > 50) { 
	            cont50++;
	         }
	         
	         idade = sc.nextInt(); 
	      }
	      
	      System.out.println("Total de pessoas com menos de 21 anos: " + cont21);
	      System.out.println("Total de pessoas com mais de 50 anos: " + cont50);
	      
	      sc.close();
	   }
}
