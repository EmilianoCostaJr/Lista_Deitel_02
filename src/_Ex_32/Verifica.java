/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Verifica
 * @author      :   Emiliano Costa
 * @date        :   2 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capítulo 2   :   Introdução a aplicativos Java – entrada/saída e operadores
 * ___________________________________________________________________________________________________________________
 * Exercicio 32 :   (Valores negativos, positivos e zero) 
                    Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos, 
                    quantos positivos e quantos zeros foram inseridos.
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*::::::IMPORTS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package _Ex_32;
import java.util.Scanner;
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM IMPORTS::::::::*/

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class Verifica {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

/**Verifica valores positivos, negativos e zero.
   Ao inserir cinco números, o programa determina e imprime quantos deles são negativos, positivos e zeros.*/
    public static void inicio() {
//    public static void main(String[] args){
    /*Variáveis.......................................................................................................*/    
        Scanner input = new Scanner(System.in);
        int iContPositivos = 0;
        int iContNegativo = 0;
        int iContZero = 0;
    /*Início..........................................................................................................*/    
        /*Entra com primeiro número*/
        System.out.print("Digite o primeiro numero inteiro: ");
        int num = input.nextInt();

        if (num < 0){
            iContNegativo = iContNegativo + 1;
        }//fim if

        if (num > 0){
            iContPositivos = iContPositivos + 1;
        }//fim if

        if (num == 0){
            iContZero = iContZero +1;
        }//fim if
        
        /*Entra com segundo número*/
        System.out.print("Digite o segundo numero inteiro: ");
        num = input.nextInt();

        if (num < 0){
            iContNegativo = iContNegativo + 1;
        }//fim if

        if (num > 0){
            iContPositivos = iContPositivos + 1;
        }//fim if

        if (num == 0){
            iContZero = iContZero +1;
        }//fim if

        /*Entra com terceiro número*/
        System.out.print("Digite o terceiro numero inteiro: ");
        num = input.nextInt();

        if (num < 0){
            iContNegativo = iContNegativo + 1;
        }//fim if

        if (num > 0){
            iContPositivos = iContPositivos + 1;
        }//fim if

        if (num == 0){
            iContZero = iContZero +1;
        }//fim if

        /*Entra com quatro número*/
        System.out.print("Digite o quarto numero inteiro: ");
        num = input.nextInt();

        if (num < 0){
            iContNegativo = iContNegativo + 1;
        }//fim if

        if (num > 0){
            iContPositivos = iContPositivos + 1;
        }//fim if

        if (num == 0){
            iContZero = iContZero +1;
        }//fim if
        
        /*Entra com último número*/
        System.out.print("Digite o Quinto numero inteiro: ");
        num = input.nextInt();

        if (num < 0){
            iContNegativo = iContNegativo + 1;
        }//fim if

        if (num > 0){
            iContPositivos = iContPositivos + 1;
        }//fim if

        if (num == 0){
            iContZero = iContZero +1;
        }//fim if

        /*Mostra resultado*/
        System.out.printf("Foram digitados %d numeros negativos\n", iContNegativo);
        System.out.println("Foram digitados " + iContZero + " numeros iguais a zero");
        System.out.printf("Foram digitados %d numeros Positivos\n", iContPositivos);
        
    }/*FIM Método main()*/

}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Fim da classe Verifica*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/