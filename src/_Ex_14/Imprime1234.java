/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : Imprime1234
 * @author      : Emiliano Costa
 * @date        : 19 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia : Java como programar, Deitel, 10º edição
 * Capitulo     : 2. Introdução aos aplicativos Java
 * ___________________________________________________________________________________________________________________
 * Descrição    : Exercicio 14
    Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par de adjacentes separados por um espaço. 
    Use as seguintes técnicas:
    a)	Uma instrução System.out.println.
    b)	Quatro instruções System.out.print.
    c)	Uma instrução System.out.printf.
 * ___________________________________________________________________________________________________________________
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*::::::IMPORTS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package _Ex_14;
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM IMPORTS::::::::*/

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class Imprime1234 {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /**Procedimento imprime no display três linhas com [1 2 3 4]*/
    public static void inicio(){
        System.out.println("Exercicio 14.............................................................................");
        System.out.println("A: usando uma instrução System.out.println");
        System.out.println("1 2 3 4");
        System.out.println("B: usando quatro instruções System.out.print");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");
        System.out.println("C: usando uma instrução System.out.printf");
        System.out.printf("%d %d %d %d \n",1,2,3,4);
    }
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/

