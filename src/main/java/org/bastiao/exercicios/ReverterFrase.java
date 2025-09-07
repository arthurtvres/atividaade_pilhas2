package org.bastiao.exercicios;

import org.bastiao.pilha.PilhaEncadeada;
import java.util.Scanner;

public class ReverterFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaEncadeada pilha = new PilhaEncadeada();

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        for (char c : frase.toCharArray()) {
            pilha.adicionar(c);
        }

        String fraseInvertida = "";
        while (!pilha.estaVazia()) {
            fraseInvertida += pilha.remover();
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);
    }
}
