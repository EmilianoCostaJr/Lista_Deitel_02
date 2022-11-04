/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : Circulo
 * @author      : Emiliano Costa
 * @date        : 13 de out. de 2022
 * Bibliografia : Java como programar, Deitel, 10º edição
 * Capitulo     : 2. Introdução aos aplicativos Java
 * ___________________________________________________________________________________________________________________
 * Descrição    : Exercício 28 (Diâmetro, circunferência e área de um círculo)
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Ex_28;

import java.util.Scanner;

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class Circulo {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

    /*Exercicio 2.28*/
    /**Recebe um valor de raio e mostra Diametro, Circuferencia e Área do circulo*/
    public static void inicio(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Exercicio 28: Dado o raio, responde qual a area e circuferencia do circulo...............");
        System.out.print("Digite o tamanho do raio (Numero inteiro) :");
        int raio = input.nextInt();
        
        System.out.printf("Diametro      : %d\n", 2 * raio);
        System.out.printf("Circuferencia : %.2f\n",2 * raio * Math.PI);
        System.out.printf("Área          : %.2f\n",Math.PI * raio * raio);
       
    }

}/*FIM da CLASSE Circulo::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/