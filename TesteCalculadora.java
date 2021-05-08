package modulo01;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		/*Fazer uma calculadora onde possua um menu com todas as operações básicas + operações como raiz, 
		 * potencia e uma opção se o numero digita é impar ou par e outra opção se ele é divisivel
		 *  por 3 (para esse caso eu só quero o retorno "SIM é DIVISIVEL" ou "NÃO, não é divisivel"). 
		 *  E  quero os tratamentos caso não possa fazer a raiz quadrada ou potencia. 
		 */
		Scanner tc = new Scanner(System.in);
		System.out.println("====================");
		System.out.println("CALCULADORA FUCTURA");
		System.out.println("====================");
		System.out.println();
		int opcao;
		while(true) {
		System.out.println("~~~~~~~~~~~~~~~~");
		System.out.printf("Digite uma opção:\n1-SOMAR\n2-SUBTRAIR\n3-MULTIPLICAR\n4-DIVIDIR\n5-RAIZ QUADRADA\n6-POTENCIA\n7-SAIR\n");
		System.out.println("~~~~~~~~~~~~~~~~");
		opcao = tc.nextInt();
		System.out.printf("VOCÊ ESCOLHEU A OPCÃO %d\n", opcao);
		while(opcao<1||opcao>7) {
			System.out.println("Opção Inválida!!!");
			System.out.println("~~~~~~~~~~~~~~~~");
			System.out.printf("Digite uma opção:\n1-SOMAR\n2-SUBTRAIR\n3-MULTIPLICAR\n4-DIVIDIR\n5-RAIZ QUADRADA\n6-POTENCIA\n7-SAIR\n");
			System.out.println("~~~~~~~~~~~~~~~~");
			opcao = tc.nextInt();
		}
		if(opcao==7) {
			System.out.println("VOCÊ ESCOLHEU OPÇÃO SAIR. ");
			System.out.println("OBRIGADO POR UTILIZAR A CALCULADORA FUCTURA!ATÉ A PROXIMA!");
		break;
		}
			System.out.println("Digite o primeiro número: ");
			double x =(int) tc.nextDouble();
			System.out.println("Digite o segundo número: ");
			double y =(int) tc.nextDouble();			
			
		
		switch(opcao) {
				case 1:
					double res=x+y;
					System.out.printf("A SOMA ENTRE %.2f E %.2f É: %.2f\n",x,y,res);
					if (res%2!=0) {
						System.out.printf("%.2f É ÍMPAR\n",res);
					}else {
						System.out.printf("%.2f É PAR\n",res);
					
					}System.out.printf("%.2f é divisível por 3?\n",res);
					if (res%3==0) {
						System.out.println("SIM! É DIVISÍVEL!");
					}else {
						System.out.println("NÃO!NÃO É DIVISÍVEL!");
					}
				
				break;
			case 2:
				double res2 =x-y;
				System.out.printf("%.2f MENOS %.2f É: %.2f\n",x,y,res2);
				if (res2%2==0) {
					System.out.printf("%.2f É PAR\n",res2);
				}else {
					System.out.printf("%.2f É ÍMPAR\n",res2);
				}
				System.out.printf("%.2f é divisível por 3?\n",res2);
				if(res2%3==0) {
					System.out.println("SIM! É DIVISÍVEL!");
				}else {
					System.out.println("NÃO!NÃO É DIVISÍVEL!");
				}break;
				
			case 3:
				double res3=x*y;
				System.out.printf("%.2f MULTIPLICADO POR %.2f é %.2f\n",x,y,res3);
				if(res3%2==1) {
						System.out.printf("%.2f ÉÍMPAR\n",res3);
				}else {
					System.out.printf("%.2f É PAR\n",res3);
				}System.out.printf("%.2f é divisível por 3?\n",res3);
				if(res3%3==0) {
					System.out.println("SIM! É DIVISÍVEL!");
				}else {
					System.out.println("NÃO!NÃO É DIVISÍVEL!");
				}break;
			case 4:
				while(y==0) {
					System.out.println("O Denominador não pode ser divisível por ZERO!\n Digite novamente o SEGUNDO"
							+ " numero:");	
					y =(int) tc.nextDouble();
				} double res4 =x/y;
				System.out.printf("%.2f DIVIDIDO POR %.2f É: %.2f\n",x,y,res4);
				if (res4%2==0) {
					System.out.printf("%.2f É PAR\n",res4);
				}else {
					System.out.printf("%.2f É ÍMPAR\n",res4);
				}System.out.printf("%.2f é divisível por 3?\n",res4);
				if(res4%3==0) {
					System.out.println("SIM! É DIVISÍVEL!");
				}else {
					System.out.println("NÃO!NÃO É DIVISÍVEL!");
				}break;
			case 5:
				while(x<0) {
					System.out.println("NÃO EXISTE RAIZ QUADRADA DE NÙMERO NEGATIVO!");
					System.out.println("DIGITE UM NÚMERO POSITIVO:");
					x=(int)tc.nextDouble();
				}double res5=Math.sqrt(x);
				System.out.printf("A RAIZ QUADRADA DE  %.2f É:%.2f\n",x,res5);
				if (res5%2==0) {
					System.out.printf("%.2f É PAR\n",res5);
				}else {
					System.out.printf("%.2f É ÍMPAR\n",res5);
				}System.out.printf("%.2f é divisível por 3!\n",res5);
				if(res5%3==0) {
					System.out.println("SIM! É DIVISÍVEL!");
				}else {
					System.out.println("NÃO!NÃO É DIVISÍVEL!");
				}
			break;
			case 6:
				
				double res6= (int)Math.pow(x, y);

			System.out.printf("A potência de   %.2f e %.2f é %.2f\n",x,y,res6);
			if (res6%2==0) {
				System.out.printf("%.2f É PAR\n",res6);
			}else {
				System.out.printf("%.2f É ÍMPAR\n",res6);
			}System.out.printf("%.2f é divisível por 3!\n",res6);
			if(res6%3==0) {
				System.out.println("SIM! É DIVISÍVEL!");
			}else {
				System.out.println("NÃO!NÃO É DIVISÍVEL!");
				}
			break;
			
		
			
		}
		}
	}
}
		


	


		




		
			
				
		
		
		
	


