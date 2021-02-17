package controller;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ExRecursividade {
	
	//Exerc�cio 6
	public void Ex06() {
		int numFatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o calculo do Fatorial: "));
		while(numFatorial <= 0) {
			numFatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor maior que zero para o calculo do Fatorial: "));
		}
		System.out.println("O resultado do fatorial � : " +functionFatorial(numFatorial));
	}
	
	public int functionFatorial(int numFatorial) {
		if(numFatorial == 1) {
			return 1;
		}
		else {
			numFatorial = (numFatorial*functionFatorial(numFatorial-1));
			return numFatorial;
		}
	}
	
	//Exerc�cio 7
	public void Ex07() {
		int n = 100;
		int resultado = somarRec(n);
		System.out.println("A soma dos valores de 1 a 100 � igual a: " +resultado);
	}
	
	public int somarRec(int n) {
		if(n ==1) {
			return 1;
		}
		else {
			return (n+ somarRec(n-1));
		}
	}
	
	//Exerc�cio 8
	public void Ex08() {
		int n= 200;
		int resultado = somaParesRec(n);
		System.out.println("A soma de todos os pares de 1 a 200 � igual a : " +resultado);
	}
	
	public int somaParesRec(int n) {
		if(n==1) {
			return 0;
		}
		else if (n%2 !=0) {
			return somaParesRec(n-1);
		}
		else {
			return n + somaParesRec(n-1);
		}
	}
	
	//Exerc�cio 9
	public void Ex09(){
		int n =300;
		int resultado = somaImparesRec(n);
		System.out.println("O resultado da somas dos �mpares de 1 a 300 � igual a : "+resultado);
		
	}
	
	public int somaImparesRec(int n) {
		if(n == 1) {
			return 1;
		}
		else if(n%2 == 0) {
			return somaImparesRec(n-1);
		}
		else {
			return n + somaImparesRec(n-1);
		}
	}
	
	//Exerc�cio 10
	public void Ex10() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a sequencia para o Calculo da sequencia de Fibonacci: "));
		
		int fibonacci = seqFibonacci(num);
		System.out.println(" O " +num+"� elemento da sequencia de Fibonacci � :" +fibonacci);
		
	}
	
	public int seqFibonacci(int N) {
		int Fn1;
		int Fn2;
		if(N == 1 || N == 0) {
			return N;
		}
		else {
			Fn1 = seqFibonacci(N-1);
			Fn2 = seqFibonacci(N-2);
			return Fn1 + Fn2;
		}
	}
	
	//Exerc�cio 11
	public void Ex11() {
		DecimalFormat fmt = new DecimalFormat();
		fmt.applyPattern("#,##0.00");
		double num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para o calculo da s�rie: "));
		double resultado = somaSerie(num);
		System.out.println("O resultado da s�rie � igual a : " +fmt.format(resultado));
	}
	
	public double somaSerie (double num) {
		double resultado;
		if(num == 0) {
			return 0;
		}
		else {
			resultado = (1/ num) + somaSerie(num-1);
			return resultado;
		}
	}
}
