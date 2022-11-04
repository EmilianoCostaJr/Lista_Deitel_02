/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   SeparaDigitosdeUmInteiro
 * author       :   Emiliano Costa
 * date         :   13 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 8º edição
 * Capitulo     :   2. Introdução aos aplicativos Java
 * ___________________________________________________________________________________________________________________
 * Descrição    :   Exercício 30 (Separando os dígitos em um inteiro)
                    Mostra em separado os algarismos de um numero com cinco digitos digitado. 
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Ex_30;

import java.util.Scanner;

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/ 
/**Exercício 30 (Separando os dígitos em um inteiro)*/
public class Separando{
/*Métodos ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

    /**Imprime em separado os algarismos de um numero com cinco digitos digitado.*/
    public static void inicio(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Exercicio 30: Separa os digitos de um inteiro............................................");
        System.out.print("Digite um inteiro com 5 algorismos: ");
        int num = input.nextInt();
        int unidade = num %10;
        num /= 10;
        int dezena = num %10;
        num /= 10;
        int centena = num % 10;
        num /=10;
        int milhar = num % 10;
        num /= 10;
        int DezMilhar = num;
        
        System.out.printf("%d  %d  %d  %d  %d\n",DezMilhar,milhar,centena,dezena,unidade);
    }
      
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/ 
}//Fim classe Separando