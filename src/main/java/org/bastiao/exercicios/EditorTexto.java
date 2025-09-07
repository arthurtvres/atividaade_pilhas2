package org.bastiao.exercicios;

import org.bastiao.pilha.Pilha;
import java.util.Scanner;

public class EditorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha texto = new Pilha(100);

        System.out.println("Digite caracteres. 'BACKSPACE' para apagar, 'ENTER' para finalizar.");

        while (true) {
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("ENTER")) {
                String textoFinal = "";
                while (!texto.estaVazia()) {
                    textoFinal = texto.remover() + textoFinal;
                }
                System.out.println("Texto final: " + textoFinal);
                break;

            } else if (entrada.equalsIgnoreCase("BACKSPACE")) {
                if (!texto.estaVazia()) {
                    System.out.println("Removendo caractere: " + (char) texto.peek());
                    texto.remover();
                }

            } else {
                for (char c : entrada.toCharArray()) {
                    texto.adicionar(c);
                }
            }
        }
    }
}
