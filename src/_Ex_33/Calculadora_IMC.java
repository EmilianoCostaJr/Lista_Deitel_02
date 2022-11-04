/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Calculadora_IMC
 * @author      :   Emiliano Costa
 * @date        :   4 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   2 Introdução a aplicativos Java – entrada/saída e operadores 
 * Seção        :   Exercício 33
 * ___________________________________________________________________________________________________________________
 * Descrição    :   (Calculadora de índice de massa corporal)
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Ex_33;

import java.util.Scanner;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Calculadora_IMC {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

    public static void inicio(){
/*Variáveis*/
        Scanner input = new Scanner(System.in);
        double peso;
        double altura;
        double IMC;
/*Início*/        
        System.out.println("Exercício 33 - Calculadora IMC");
        System.out.print("Digite o peso: ");
        peso = input.nextDouble();
        System.out.print("Digite a altura: ");
        altura = input.nextDouble();
        IMC = (peso/(altura * altura));
        System.out.print("O IMC indica: Esta ");
        if (IMC < 18.5)
            System.out.println("abaixo do peso: menos de 18,5");
        if(IMC >= 18.5 && IMC < 24.9)
            System.out.println("normal: entre 18.5 e 24.5");
        if(IMC >= 24.9 && IMC < 30)    
            System.out.println("acima do peso: entre 24.5 e 29.9");
        if(IMC >=30)
            System.out.println("obeso: acima de 30");
    }
    
    
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

