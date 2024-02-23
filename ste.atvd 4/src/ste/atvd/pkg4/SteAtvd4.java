/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ste.atvd.pkg4;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SteAtvd4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int cont = 0, num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número maior que 0:");
        num = teclado.nextInt();
        if (num == 0) {
            cont = 1;
        } else {
            while (num > 0) {
                num /= 10;
                cont++;
            }

        }
        System.out.println("A quantidade de dígitos desse número é: " + cont);
    }

}
