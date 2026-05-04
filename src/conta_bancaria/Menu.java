package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.util.Cores;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		//Teste Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente (2, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//Teste Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca (3, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		

		
		int opcao;
		
		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "***********************************************");
			System.out.println("                                               ");
			System.out.println("             BANCO DO BRAZIL COM Z             ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("                                               ");
			System.out.println("        1 - Criar conta                        ");
			System.out.println("        2 - Listar todas as contas             ");
			System.out.println("        3 - Buscar conta por número            ");
			System.out.println("        4 - Atualizar dados da conta           ");
			System.out.println("        5 - Apagar conta                       ");
			System.out.println("        6 - Sacar                              ");
			System.out.println("        7 - Depositar                          ");
			System.out.println("        8 - Transferir valores entre contas    ");
			System.out.println("        0 - Sair                               ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("ENTRE COM A OPÇÃO DESEJADA:                    ");
			System.out.println("                                               " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if (opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta \n\n");
				break;
				
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as contas \n\n");
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da conta por número \n\n");
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da conta \n\n");
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar conta \n\n");
				break;
				
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque \n\n");
				break;
				
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
				break;
				
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferencia entre contas\n\n");
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				break;
			}
		}
		
	}
		public static void sobre() {
			System.out.println("\n***********************************************");
			System.out.println("Projeto desenvolvido por: ");
			System.out.println("Dayane Santana - dayanesantana59@gmail.com");
			System.out.println("github.com/dayanesantana");
			System.out.println("\n***********************************************");


		
	}

}
