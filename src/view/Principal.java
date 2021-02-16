package view;
import javax.swing.JOptionPane;

import controller.ExRecursividade;
import controller.Exercicios;

public class Principal {

	public static void main(String[] args) {
		Exercicios op = new Exercicios();
		ExRecursividade opRec = new ExRecursividade();
		
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione o exerc�cio: \n"
					+ "1 - Exerc�cio 1;\n"
					+ "2 - Exerc�cio 2;\n"
					+ "3 - Exerc�cio 3;\n"
					+ "4 - Exerc�cio 4;\n"
					+ "5 - Exerc�cio 5;\n"
					+ " -----Recursividade----- \n"
					+ "6 - Exerc�cio 6;\n" 
					+ "7 - Exerc�cio 7;\n"
					+ "8 - Exerc�cio 8;\n"
					+ "9 - Exerc�cio 9;\n"
					+ "10 - Exerc�cio 10;\n"
					+ "11 - Exerc�cio 11;\n"
					+ "0 - Para sair da aplica��o"));
			switch(opc) {
			case 1 : System.out.println("----------------- \n"); op.Ex1();
			break;
			case 2 : System.out.println("----------------- \n");op.Ex2();
			break;
			case 3 : System.out.println("----------------- \n");op.Ex3();
			break;
			case 4 : System.out.println("----------------- \n");op.Ex4();
			break;
			case 5 : System.out.println("----------------- \n");op.Ex5();
			break;
			case 6 : System.out.println("----------------- \n");opRec.Ex06();
			break;
			case 7 : System.out.println("----------------- \n");opRec.Ex07();
			break;
			case 8 : System.out.println("----------------- \n");opRec.Ex08();
			break;
			case 9 : System.out.println("----------------- \n");opRec.Ex09();
			break;
			case 10 : System.out.println("----------------- \n");opRec.Ex10();
			break;
			case 11 : System.out.println("----------------- \n");opRec.Ex11();
			break;
			case 0 : JOptionPane.showMessageDialog(null, "Obrigado por utilizar a aplica��o.");
			break;
			
			default: JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
			}
		}
		
		while(opc!=0);
		
		//op.Ex1();
		//op.Ex2();
		//op.Ex3();
		//op.Ex4();
		//op.Ex5();
		//opRec.Ex6();
		//opRec.Ex07();
		//opRec.Ex08();
		//opRec.Ex09();
		//opRec.Ex10();
		//opRec.Ex11();
	}

}
