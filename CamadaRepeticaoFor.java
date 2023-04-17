package LacosDeRepeticao;

import java.util.Scanner;

public class CamadaRepeticaoFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, pares = 0, impares = 0;
	      
	      for(int i = 1; i <= 10; i++) {
	         System.out.println("Digite o " + i + "º número:");
	         num = sc.nextInt();
	         
	         if(num % 2 == 0) { 
	            pares++; 
	         } else { 
	            impares++; 
	         }
	      }
	      
	      System.out.println("Total de números pares: " + pares);
	      System.out.println("Total de números ímpares: " + impares);
	      
	     sc.close();
	}
}
