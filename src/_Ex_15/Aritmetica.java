/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Aritmetica                                                                                       *
 * @author      :   Emiliano Costa                                                                                   *
 * @date        :   15 de out. de 2022                                                                               * 
 * __________________________________________________________________________________________________________________*
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                          *
 * Capitulo     :   2. Introdução aos aplicativos Java                                                               *    
 * __________________________________________________________________________________________________________________*
 * Descrição    :   Exercício 15 (Aritmética) 
                    Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números 
                    e imprima sua soma, produto, diferença e auociente (divisão). Utilize as técnicas mostradas na 
                    Figura 2.7.
* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Ex_15;
import java.util.Scanner;

public class Aritmetica {
    
    /**Insere: soma, produto, diferença e quociente entre dois numeros digitados*/
    public static void inicio(){
    /*Variáveis.......................................................................................................*/    
        Scanner input = new Scanner(System.in);
        int iNumero_1;
        int iNumero_2;
        int iSoma;
        int iDiferença;
        int iMult;
        int iQuociente;
        int iResto;
    
    /*Início do código................................................................................................*/
        /*Insere os inteiros*/
        System.out.println("""
                           Exercicio 15: Soma, diferença, multiplica, divide, calcula o resto
                           Verifica qual o maior entre dois inteiros.""");
        System.out.print("Digite o primeiro inteiro: ");
        iNumero_1 = input.nextInt();
        
        System.out.print("Digite o segundo inteiro, menor que o primeiro: ");
        iNumero_2 = input.nextInt();
        
        /*faz os calculos*/
        iSoma = iNumero_1 + iNumero_2;
        iMult = iNumero_1 * iNumero_2;
        iQuociente = iNumero_1 / iNumero_2;
        iResto = iNumero_1 % iNumero_2;
        iDiferença = iNumero_1 - iNumero_2;
                
        /*Mostra os resultados*/
        System.out.printf("Soma     : %3d + %3d = %4d\n" , iNumero_1,iNumero_2,iSoma);
        System.out.printf("Diferença: %3d - %3d = %4d\n" , iNumero_1,iNumero_2, iDiferença);
        System.out.printf("Produto  : %3d x %3d = %4d\n" , iNumero_1,iNumero_2,iMult);
        System.out.printf("Quociente: %3d / %3d = %4d\n" , iNumero_1,iNumero_2,iQuociente);
        System.out.printf("Sobra resto          = %4d\n" , iResto);
    }

/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM MÉTODOS*/
}/*Fim da classe Aritmetica*/