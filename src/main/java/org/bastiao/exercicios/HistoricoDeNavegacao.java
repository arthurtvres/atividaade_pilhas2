package org.bastiao.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class HistoricoDeNavegacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> historico = new Stack<>();

        while (true) {
            System.out.println("Digite o site a ser acessado (ou 'VOLTAR' para voltar, 'SAIR' para sair):");
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("SAIR")) {
                System.out.println("Saindo do programa...");
                break;
            }
            else if (entrada.equalsIgnoreCase("VOLTAR")) {
                if (!historico.isEmpty()) {
                    System.out.println("Voltando de: " + historico.pop());
                } else {
                    System.out.println("Histórico vazio!");
                }
            } else {
                historico.push(entrada);
                System.out.println("Acessando site: " + entrada);
            }
        }
    }
}
