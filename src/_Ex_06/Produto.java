/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : Produto                                                                                             *
 * @author      : Emiliano Costa                                                                                      *
 * @date        : 15 de out. de 2022                                                                                  * 
 * ___________________________________________________________________________________________________________________*
 * Bibliografia : Java como programar, Deitel, 10º edição                                                             *
 * Capitulo     : 2. Introdução aos aplicativos Java                                                                  *    
 * ___________________________________________________________________________________________________________________*
 * Descrição    : Calcula o produto de três números inteiros
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 
package _Ex_06;

import java.util.Scanner;

/**Exercício 2.6 do Livro Deitel */
public class Produto {
    
    /**Aritmetica o produto três inteiros inseridos pelo usuário, usa java.util.Scanner*/
    public static void inicio(){
    /*Variáveis.......................................................................................................*/    
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;
        int resultado;
    /*Início..........................................................................................................*/    
        System.out.println("Exercicio 6: Produto de tres inteiros.");
        System.out.print("Digite o primeiro inteiro: ");
        x = input.nextInt();
        
        System.out.print("Digite o segundo inteiro: ");
        y = input.nextInt();

        System.out.print("Digite o terceiro Inteiro: ");
        z = input.nextInt();

        resultado = x * y * z;
        
        System.out.printf("Produto:\n%d * %d * %d = %d\n" , x,y,z,resultado);
    }
    
 
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM MÉTODOS*/
}/*Fim da classe Produto*/