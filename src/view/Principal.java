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
			opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione o exercício: \n"
					+ "1 - Exercício 1;\n"
					+ "2 - Exercício 2;\n"
					+ "3 - Exercício 3;\n"
					+ "4 - Exercício 4;\n"
					+ "5 - Exercício 5;\n"
					+ " -----Recursividade----- \n"
					+ "6 - Exercício 6;\n" 
					+ "7 - Exercício 7;\n"
					+ "8 - Exercício 8;\n"
					+ "9 - Exercício 9;\n"
					+ "10 - Exercício 10;\n"
					+ "11 - Exercício 11;\n"
					+ "0 - Para sair da aplicação"));
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
			case 0 : JOptionPane.showMessageDialog(null, "Obrigado por utilizar a aplicação.");
			break;
			
			default: JOptionPane.showMessageDialog(null, "Opção Inválida");
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
