package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {

			Scanner teclado = new Scanner(System.in);
			Random random = new Random();
			String elemento, elementoPc;
			int EscolhaUsuario, EscolhaPC;

			//Menu
			System.out.println("***********************************");
			System.out.println("          J O K E N P Ô");
			System.out.println("***********************************");
			System.out.println("");
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println("");
			
			//Escolha
			System.out.println("-----------------------------------");
			System.out.print("Faça sua escolha (1 a 3): ");
			EscolhaUsuario = teclado.nextInt();
			EscolhaPC = random.nextInt(3) +1;
			elemento = String.valueOf(EscolhaUsuario);
			elementoPc = String.valueOf(EscolhaUsuario);
			
			if(EscolhaUsuario == 1) {
				elemento = "Pedra";
			}
			if(EscolhaUsuario == 2) {
				elemento = "Papel";
			}
			if(EscolhaUsuario == 3) {
				elemento = "Tesoura";
			}
			
			if(EscolhaPC == 1) {
				elementoPc = "Pedra";
			}
			if(EscolhaPC== 2) {
				elementoPc = "Papel";
			}
			if(EscolhaPC == 3) {
				elementoPc = "Tesoura";
			}
			
			System.out.println("");
			System.out.println("Você escolheu -------> " + elemento + "!");
			System.out.println("O PC escolheu -------> " + elementoPc + "!");
			
			
			//Condições
			if (EscolhaPC == 1 && EscolhaUsuario == 2 || EscolhaPC == 2 && EscolhaUsuario == 3 || EscolhaPC == 3 && EscolhaUsuario == 1) {
				System.out.println("");
				System.out.println("***********************************");
				System.out.println("********    PARABÉNS!!!    ********");
				System.out.println("********   VOCÊ VENCEU!!   ********");
				System.out.println("***********************************");
			}
				if(EscolhaPC == 1 && EscolhaUsuario == 3 || EscolhaPC == 2 && EscolhaUsuario == 1 || EscolhaPC == 3 && EscolhaUsuario == 2) {
					System.out.println("");
					System.out.println("***********************************");
					System.out.println("********    QUE PENA!!!    ********");
					System.out.println("********   VOCÊ PERDEU!!   ********");
					System.out.println("***********************************");
				}
					
					if (EscolhaPC == EscolhaUsuario) {
						System.out.println("");
						System.out.println("************************************");
						System.out.println("********        OPS!!!      ********");
						System.out.println("********  HOUVE UM EMPATE!! ********");
						System.out.println("************************************");
					}
						
						if (EscolhaUsuario != 1 && EscolhaUsuario != 2 && EscolhaUsuario != 3) {
							System.out.println("");
							System.out.println("************************************");
							System.out.println("********        OPA!!!      ********");
							System.out.println("********  NÚMERO INVÁLIDO!! ********");
							System.out.println("************************************");
							
						} else {
							
						}
		
	}

}
