/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ste.tvd.pkg2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SteTvd2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int livro;
        double A, B;
        System.out.println("Digite a quantidade de livros:");
        livro= teclado.nextInt();
        A=(0.25*livro)+7.5;
        B=(0.50*livro)+2.5;
        System.out.println("Critério A:" +A+ "\nCritério B:" +B);
        if(A<B){
          System.out.println("O critério A é o melhor");  
        }
        if(B<A){
            System.out.println("O critério B é o melhor");
        }
        if(A==B) {
            System.out.println("Os dois critérios são bons");
        }
    }
    
}
