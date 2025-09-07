package org.bastiao.exercicios;

import org.bastiao.pilha.Pilha;
import java.util.Scanner;

public class UndoOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha comandos = new Pilha(10);

        while (true) {
            System.out.print("Digite um comando (número), 'DESFAZER' ou 'SAIR': ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("SAIR")) {
                System.out.println("Programa encerrado...");
                break;

            } else if (entrada.equalsIgnoreCase("DESFAZER")) {
                if (!comandos.estaVazia()) {
                    System.out.println("Desfazendo comando: " + (int) comandos.remover());
                } else {
                    System.out.println("Nenhum comando para desfazer.");
                }

            } else {
                int comando = Integer.parseInt(entrada);
                comandos.adicionar(comando);
                System.out.println("Executando comando: " + comando);
            }
        }
    }
}
