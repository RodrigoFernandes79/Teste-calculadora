package modulo01;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		/*Fazer uma calculadora onde possua um menu com todas as opera��es b�sicas + opera��es como raiz, 
		 * potencia e uma op��o se o numero digita � impar ou par e outra op��o se ele � divisivel
		 *  por 3 (para esse caso eu s� quero o retorno "SIM � DIVISIVEL" ou "N�O, n�o � divisivel"). 
		 *  E  quero os tratamentos caso n�o possa fazer a raiz quadrada ou potencia. 
		 */
		Scanner tc = new Scanner(System.in);
		System.out.println("====================");
		System.out.println("CALCULADORA FUCTURA");
		System.out.println("====================");
		System.out.println();
		int opcao;
		while(true) {
		System.out.println("~~~~~~~~~~~~~~~~");
		System.out.printf("Digite uma op��o:\n1-SOMAR\n2-SUBTRAIR\n3-MULTIPLICAR\n4-DIVIDIR\n5-RAIZ QUADRADA\n6-POTENCIA\n7-SAIR\n");
		System.out.println("~~~~~~~~~~~~~~~~");
		opcao = tc.nextInt();
		System.out.printf("VOC� ESCOLHEU A OPC�O %d\n", opcao);
		while(opcao<1||opcao>7) {
			System.out.println("Op��o Inv�lida!!!");
			System.out.println("~~~~~~~~~~~~~~~~");
			System.out.printf("Digite uma op��o:\n1-SOMAR\n2-SUBTRAIR\n3-MULTIPLICAR\n4-DIVIDIR\n5-RAIZ QUADRADA\n6-POTENCIA\n7-SAIR\n");
			System.out.println("~~~~~~~~~~~~~~~~");
			opcao = tc.nextInt();
		}
		if(opcao==7) {
			System.out.println("VOC� ESCOLHEU OP��O SAIR. ");
			System.out.println("OBRIGADO POR UTILIZAR A CALCULADORA FUCTURA!AT� A PROXIMA!");
		break;
		}
			System.out.println("Digite o primeiro n�mero: ");
			double x =(int) tc.nextDouble();
			System.out.println("Digite o segundo n�mero: ");
			double y =(int) tc.nextDouble();			
			
		
		switch(opcao) {
				case 1:
					double res=x+y;
					System.out.printf("A SOMA ENTRE %.2f E %.2f �: %.2f\n",x,y,res);
					if (res%2!=0) {
						System.out.printf("%.2f � �MPAR\n",res);
					}else {
						System.out.printf("%.2f � PAR\n",res);
					
					}System.out.printf("%.2f � divis�vel por 3?\n",res);
					if (res%3==0) {
						System.out.println("SIM! � DIVIS�VEL!");
					}else {
						System.out.println("N�O!N�O � DIVIS�VEL!");
					}
				
				break;
			case 2:
				double res2 =x-y;
				System.out.printf("%.2f MENOS %.2f �: %.2f\n",x,y,res2);
				if (res2%2==0) {
					System.out.printf("%.2f � PAR\n",res2);
				}else {
					System.out.printf("%.2f � �MPAR\n",res2);
				}
				System.out.printf("%.2f � divis�vel por 3?\n",res2);
				if(res2%3==0) {
					System.out.println("SIM! � DIVIS�VEL!");
				}else {
					System.out.println("N�O!N�O � DIVIS�VEL!");
				}break;
				
			case 3:
				double res3=x*y;
				System.out.printf("%.2f MULTIPLICADO POR %.2f � %.2f\n",x,y,res3);
				if(res3%2==1) {
						System.out.printf("%.2f ��MPAR\n",res3);
				}else {
					System.out.printf("%.2f � PAR\n",res3);
				}System.out.printf("%.2f � divis�vel por 3?\n",res3);
				if(res3%3==0) {
					System.out.println("SIM! � DIVIS�VEL!");
				}else {
					System.out.println("N�O!N�O � DIVIS�VEL!");
				}break;
			case 4:
				while(y==0) {
					System.out.println("O Denominador n�o pode ser divis�vel por ZERO!\n Digite novamente o SEGUNDO"
							+ " numero:");	
					y =(int) tc.nextDouble();
				} double res4 =x/y;
				System.out.printf("%.2f DIVIDIDO POR %.2f �: %.2f\n",x,y,res4);
				if (res4%2==0) {
					System.out.printf("%.2f � PAR\n",res4);
				}else {
					System.out.printf("%.2f � �MPAR\n",res4);
				}System.out.printf("%.2f � divis�vel por 3?\n",res4);
				if(res4%3==0) {
					System.out.println("SIM! � DIVIS�VEL!");
				}else {
					System.out.println("N�O!N�O � DIVIS�VEL!");
				}break;
			case 5:
				while(x<0) {
					System.out.println("N�O EXISTE RAIZ QUADRADA DE N�MERO NEGATIVO!");
					System.out.println("DIGITE UM N�MERO POSITIVO:");
					x=(int)tc.nextDouble();
				}double res5=Math.sqrt(x);
				System.out.printf("A RAIZ QUADRADA DE  %.2f �:%.2f\n",x,res5);
				if (res5%2==0) {
					System.out.printf("%.2f � PAR\n",res5);
				}else {
					System.out.printf("%.2f � �MPAR\n",res5);
				}System.out.printf("%.2f � divis�vel por 3!\n",res5);
				if(res5%3==0) {
					System.out.println("SIM! � DIVIS�VEL!");
				}else {
					System.out.println("N�O!N�O � DIVIS�VEL!");
				}
			break;
			case 6:
				
				double res6= (int)Math.pow(x, y);

			System.out.printf("A pot�ncia de   %.2f e %.2f � %.2f\n",x,y,res6);
			if (res6%2==0) {
				System.out.printf("%.2f � PAR\n",res6);
			}else {
				System.out.printf("%.2f � �MPAR\n",res6);
			}System.out.printf("%.2f � divis�vel por 3!\n",res6);
			if(res6%3==0) {
				System.out.println("SIM! � DIVIS�VEL!");
			}else {
				System.out.println("N�O!N�O � DIVIS�VEL!");
				}
			break;
			
		
			
		}
		}
	}
}
		


	


		




		
			
				
		
		
		
	


