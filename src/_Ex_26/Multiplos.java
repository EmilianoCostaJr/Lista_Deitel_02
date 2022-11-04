/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : Multiplos
 * @author      : Emiliano Costa
 * @date        : 19 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia : Java como programar, Deitel, 10º edição
 * Capitulo     : 2. Introdução aos aplicativos Java
 * ___________________________________________________________________________________________________________________
 * Descrição    : Exercício 26 (Múltiplos) 
    Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir 
    o resultado. [Dica: utilize o operador de resto.]
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*::::::IMPORTS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package _Ex_26;

import java.util.Scanner;

/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM IMPORTS::::::::*/


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class Multiplos {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /**Determina se o primeiro número digitado é multiplo do segundo*/
    public static void inicio(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro inteiro");
        int iNum1 = input.nextInt();
        
        System.out.println("Digite o segundo numero");
        int iNum2 = input.nextByte();
        
        int iTemp;
        
        if (iNum1 < iNum2){
            iTemp = iNum1;
            iNum1 = iNum2;
            iNum2 = iTemp;
        }
        
        if (iNum1 % iNum2 == 0){
            System.out.printf("%d é multiplo de %d\n",iNum1,iNum2);
        }

        if (iNum1 % iNum2 != 0){
            System.out.printf("%d não é multiplo de %d\n",iNum1,iNum2);
        }
    }

}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
