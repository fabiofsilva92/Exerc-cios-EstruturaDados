package controller;

import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicios {
	
	public Exercicios() {
		super();
	}
	
	//Exercício 1
	public void Ex1(){
		
		DecimalFormat fmt = new DecimalFormat();
		fmt.applyPattern("#,##0.00");
		
		double[] saldos = new double[100];
		double mediaRange = 0;
		double mediaGeral = 0;
		double somaNegativo = 0;
		int contadorRange = 0;
		
		System.out.println("Números Gerados entre -100 e 1000: ");
		for(int i = 0; i<100; i++) {
			saldos[i] = (double)((Math.random()*1100)-100); //Gerando números entre -100 e 1000.
			System.out.println(fmt.format(saldos[i])); //Printando os números para a conferencia.
			//Preparando o calculo para média entre 100 a 1000;
			if(saldos[i] >100 && saldos[i]<1000 ) {
				contadorRange++;
				mediaRange = mediaRange + saldos[i];
			}
			//Soma dos negativos
			if(saldos[i]<0) {
				somaNegativo = somaNegativo + saldos[i];
			}
			//Media geral dos saldos
			mediaGeral = mediaGeral + saldos[i];
		}
		
		//System.out.println("Soma dos saldos no range : " +fmt.format(mediaRange)); //Debug
		//System.out.println("Quantidade de numeros no range: " +fmt.format(contadorRange)); //Debug
		System.out.println("A media dos saldos entre 100 à 1000 é: " +fmt.format(mediaRange/contadorRange));
		//System.out.println("Soma de todos os saldos:" +fmt.format(mediaGeral)); //Debug
		System.out.println("A média geral dos saldos é: " + fmt.format(mediaGeral/100));
		System.out.println("A soma dos saldos negativos é: "+fmt.format(somaNegativo));
	}
	
	//Exercício 2
	public void Ex2() {
		Random gerar = new Random();
		int[] vetor = new int[5];
		int[] vetorFatorial = new int[5];
		
		System.out.println("Vetor Gerado: ");
		for(int i = 0; i<5; i++) {
			vetor[i] = gerar.nextInt(10); //Gerar número de 0 a 10
			System.out.print(vetor[i] + " | ");
		}
		System.out.println("");
		System.out.println("Vetor com os fatoriais respectivamente: ");
		for(int i = 0; i<5; i++) {
			vetorFatorial[i] = calcFatorial(vetor[i]);
			System.out.print(vetorFatorial[i] + " | ");
		}
	}
	
	public int calcFatorial(int num) {
		for(int i = num-1; i>0; i--) {
			num = num*i;
		}
		return num;
	}
	

	
	//Exercício 3
	public void Ex3() {
		int[] vetorInteiro = new int[100];
		int aux;
		for(int i = 0; i<100; i++) {
			double vetor;
			vetor = (double)((Math.random()*200) -100); //Gerando valores entre -100 e 100
			vetorInteiro[i] = (int)vetor;
		}
		//Bubble Sort
		for(int i = 0; i<99; i++) {
			for (int j = i+1; j<100; j++) {
				if(vetorInteiro[i] > vetorInteiro[j]) {
					aux = vetorInteiro[i];
					vetorInteiro[i] = vetorInteiro[j];
					vetorInteiro[j] = aux;
				}
			}
		}
		//Print do vetor organizado
		for(int i : vetorInteiro) {
			System.out.println(i);
		}
	}
	
	//Exercício 4
	public void Ex4() {
		Random gerar = new Random();
		int contadorImpar = 0, contadorDiv3 =0, contadorDiv8 = 0, soma1a100 = 0;
		int[][] matriz = new int[4][4];
		
		for(int i = 0; i <4; i++) {
			for (int j= 0 ; j<4; j++) {
				matriz[i][j] = gerar.nextInt(150); //Gerando valores entre 0 e 150
				//System.out.println(matriz[i][j]);
				if(matriz[i][j]>=1 && matriz[i][j]<=100) {
					soma1a100 = soma1a100 + matriz[i][j];
				}
				if(matriz[i][j]%8 == 0) {
					contadorDiv8++;
					//System.out.println("Qtd Divisivel por 8: " +contadorDiv8);
				}
				if(matriz[i][j] % 3 == 0 && matriz[i][j]%2 !=0) {
					contadorDiv3++;
					//System.out.println("CONTADOR DIVISIVEL POR 3 :" +contadorDiv3);
				}
				if(matriz[i][j] >= 30 && matriz[i][j] <=50 && (matriz[i][j]%2 != 0)) {
					contadorImpar++;
					//System.out.println("CONTADOR IMPAR " +contadorImpar);
				}
			}
		}
		System.out.println("A Soma dos valores de 1 a 100: " +soma1a100);
		System.out.println("Quantidade de nº impares entre 30 a 50 : "+contadorImpar);
		System.out.println("Quantidade de números divisíveis por 8: " +contadorDiv8);
		System.out.println("Quantidade de números divisíveis por 3: " +contadorDiv3);
		//Organizando o vetor para apresentação final, poderia deixar uma variavel auxiliar para pegar o maior valor, porém decidi seguir esse raciocinio para apresentar a matriz no final
		int [] vetoraux = new int[16];
		int aux;
		int cont = 0;
		
		for(int i= 0; i<4; i++) {
			for (int j=0; j<4; j++) {
					vetoraux[cont] = matriz[i][j];
					cont++;
			}
		}
		
		for(int i = 0; i<15; i++) {
			for(int j = i+1; j<16; j++) {
				if(vetoraux[i] > vetoraux[j]) {
					aux = vetoraux[i];
					vetoraux[i] = vetoraux[j];
					vetoraux[j] = aux;
				}
			}
		}
						
		cont = 0;
		for(int i= 0; i<4; i++) {
			for (int j=0; j<4; j++) {
				matriz[i][j] = vetoraux[cont];
				cont++;
				//System.out.println(matriz[i][j]);
			}
		}
		
		System.out.println("O maior número informado na matriz é: " +matriz[3][3]);
		System.out.println("O valor do fatorial do maior número é: " +calcFatorial(matriz[3][3])); //O valor fica muito alto e o programa zera.
		System.out.println("_______________ MATRIZ UTILIZADA _______________");
		
		for(int i= 0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print("  " +matriz[i][j] + "  |");
			}
			System.out.println("");
		}
	}
	
	//Exercício 5
	public void Ex5() {
		int [][] matriz = new int [4][4];
		int predefinido = 1;
		
		for(int i = 0; i<4; i++) {
			for (int j = 0; j<4; j++) {
				if(i == j ) {
					matriz[i][j] = predefinido;
					predefinido = predefinido * 3;
				}
				else {
					matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para ser "
							+ "armazenado na linha " +i+ " e coluna " +j+ " da matriz: " ));
				}
			}
		}
		//Printando a matriz finalizada
		for (int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println("");
		}
		
	}

		
}
	
	
