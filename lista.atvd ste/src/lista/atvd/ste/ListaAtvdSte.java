/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.atvd.ste;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ListaAtvdSte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1, nota2, nota3, media, rec, medF;
        Scanner tex = new Scanner(System.in);
        System.out.println("digite a nota da primeira prova");
        nota1 = tex.nextInt();
        System.out.println("digite a nota da segunda prova");
        nota2 = tex.nextInt();
        System.out.println("digite a nota da terceira prova");
        nota3 = tex.nextInt();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média é:" + media);
        if (media >= 7) {
            System.out.println("Você está aprovado!:)");

        } else {
            System.out.println("Você está de recuperação");
            System.out.println("Digite a nota da recuperação");
            rec = tex.nextInt();
            medF = (media + rec) / 2;
            System.out.println("Media da recuperação:" + medF);
            if (medF >= 7.0) {
                System.out.println("Você está aprovado!!:) ");

            } else {
                System.out.println("Você está reprovado :/ ");
            }
        }

    }
}