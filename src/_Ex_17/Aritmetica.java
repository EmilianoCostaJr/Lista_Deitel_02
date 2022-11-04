/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : Aritmetica
 * @author      : Emiliano Costa
 * @date        : 19 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia : Java como programar, Deitel, 10º edição
 * Capitulo     : 2. Introdução aos aplicativos Java
 * ___________________________________________________________________________________________________________________
 * Descrição    : Exercício 17
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*::::::IMPORTS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package _Ex_17;

import java.util.Scanner;

/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM IMPORTS::::::::*/


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class Aritmetica {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    public static void inicio(){

       Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro inteiro: ");
        int num1 = input.nextInt();

        int maior = num1;
        int menor = num1;
        
        System.out.print("Digite o segundo inteiro: ");
        int num2 = input.nextInt();

        if (num2 > maior){
            maior = num2;
        }
        if (num2 < menor){
            menor = num2;
        }
        
        System.out.print("Digite o terceiro inteiro: ");
        int num3 = input.nextInt();

        if (num3 > maior){
            maior = num2;
        }
        if (num3 < menor){
            menor = num2;
        }
        
        int soma = num1 + num2 + num3;
        int media = soma /3;
        int produto = num1 * num2 * num3;

        System.out.println("");
        System.out.printf("Soma    : %d + %d + %d    = %d\n",num1,num2,num3,soma);    
        System.out.printf("Media   :(%d + %d + %d)/3 = %d\n",num1,num2,num3,media);    
        System.out.printf("Produto : %d * %d * %d    = %d\n",num1,num2,num3,produto);    
        System.out.printf("Menor   : %d\n",menor);    
        System.out.printf("Maior   : %d\n",maior);           
    }

}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
