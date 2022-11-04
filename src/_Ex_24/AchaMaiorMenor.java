/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : AchaMaiorMenor
 * @author      : Emiliano Costa
 * @date        : 19 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia : Java como programar, Deitel, 10º edição
 * Capitulo     : 2. Introdução aos aplicativos Java
 * ___________________________________________________________________________________________________________________
 * Descrição    : Exercício 24 (Inteiros maiores e menores) 
    Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro no grupo. 
    Utilize somente as técnicas de programação que você aprendeu neste capítulo.
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*::::::IMPORTS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package _Ex_24;

import java.util.Scanner;

/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM IMPORTS::::::::*/


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class AchaMaiorMenor {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /**Acha o maior e menor entre cinco números digitados pelo usuário*/
    public static void inicio(){
    /*var*/
        Scanner input = new Scanner(System.in);
        int iMaior;
        int iMenor;
        int iEntrada;
        
    /*Inicio*/    
        /*Recebe o primeiro número*/
        System.out.print("Digite o primeiro inteiro: ");
        iEntrada = input.nextInt();

        iMaior = iEntrada;
        iMenor = iEntrada;
        
        /*Recebe o segundo número*/
        System.out.print("Digite o próximo inteiro: ");
        iEntrada = input.nextInt();

        if (iEntrada > iMaior){
            iMaior = iEntrada;
        }
        
        if (iEntrada < iMenor){
            iMenor = iEntrada;
        }
        
        /*Recebe o terceiro número*/
        System.out.print("Digite o próximo inteiro: ");
        iEntrada = input.nextInt();

        if (iEntrada > iMaior){
            iMaior = iEntrada;
        }
        
        if (iEntrada < iMenor){
            iMenor = iEntrada;
        }
        
        /*Recebe o quarto número*/
        System.out.print("Digite o próximo inteiro: ");
        iEntrada = input.nextInt();

        if (iEntrada > iMaior){
            iMaior = iEntrada;
        }
        
        if (iEntrada < iMenor){
            iMenor = iEntrada;
        }
        
        /*Recebe o quinto número*/
        System.out.print("Digite o último inteiro: ");
        iEntrada = input.nextInt();

        if (iEntrada > iMaior){
            iMaior = iEntrada;
        }
        
        if (iEntrada < iMenor){
            iMenor = iEntrada;
        }
        
        /*Mostra o resultado*/
        System.out.printf("Maior: %d\n",iMaior);
        System.out.printf("Menor: %d\n",iMenor);
    }


}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/