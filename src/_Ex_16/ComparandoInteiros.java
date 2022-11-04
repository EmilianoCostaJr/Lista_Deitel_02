/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   ComparandoInteiros
 * @author      :   Emiliano Costa
 * @date        :   19 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   2. Introdução aos aplicativos Java
 * ___________________________________________________________________________________________________________________
 * Descrição    :   Exercício 16 {Comparando inteiros) 
                    Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números 
                    e exiba o número maior seguido pelas palavras “is larger". 
                    Se os números forem iguais, imprima a mensagem “These numbers are equal"
                    Utilize as técnicas mostradas na Figura 2.15.
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*::::::IMPORTS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package _Ex_16;

import java.util.Scanner;

/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM IMPORTS::::::::*/

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class ComparandoInteiros {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
        public static void inicio(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro inteiro: ");
        int iMaior = input.nextInt();
        
        System.out.print("Digite o segundo inteiro: ");
        int iNumero = input.nextInt();

        
        if (iMaior < iNumero){
            iMaior = iNumero;
            System.out.printf("Maior = %d\n", iMaior);
        }
        
        if(iMaior == iNumero){
            System.out.println("These numbers are equal");
        }
        

    }
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/
