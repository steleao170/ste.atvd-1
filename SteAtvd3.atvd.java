/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ste.atvd.pkg3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SteAtvd3 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas1, minutos1, segundos1, horas2, minutos2, segundos2, sh, sm, ss, dh, dm, ds;
        
        System.out.println("Insira o primeiro intervalo de tempo");
        System.out.println("Horas: ");
        horas1 = scanner.nextInt();
        System.out.println("Minutos: ");
        minutos1 = scanner.nextInt();
        System.out.println("Segundos: ");
        segundos1 = scanner.nextInt();
        System.out.println("insira o segundo intervalo de tempo");
        System.out.println("Horas: ");
        horas2 = scanner.nextInt();
        System.out.println("Minutos: ");
        minutos2 = scanner.nextInt();
        System.out.println("Segundos: ");
        segundos2 = scanner.nextInt();
      
        sh= horas1+horas2;
        sm= minutos1+minutos2;
                ss=segundos1+segundos2;
                dh= Math.abs(horas1-horas2);
                dm= Math.abs(minutos1-minutos2);
                ds= Math.abs(segundos1-segundos2);
                sm += ss/60;
                ss %= 60;
                sh+= sm/60;
                sm%=60;
                System.out.println("\nA Soma entre os Intervalos de Tempo é:");
                System.out.printf("%02d:%02d:%02d\n", sh, sm, ss );
                System.out.println("\nA Diferença entre os Intervalos de Tempo é de:");
                System.out.printf("%02d:%02d:%02d\n", dh, dm, ds );
    }

}
