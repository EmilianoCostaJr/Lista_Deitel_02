/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   QuadradosCubos
 * @author      :   Emiliano Costa
 * @date        :   19 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capítulo 2   :   Introdução a aplicativos Java – entrada/saída e operadores
 * Exercício 31 :   (Tabela de Quadrados e Cubos)
                    Utilizando apenas as técnicas de programação que aprendeu neste capítulo, escreva um aplicativo que
                    calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de 
                    tabela.
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*::::::IMPORTS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package _Ex_31;
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM IMPORTS::::::::*/

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class QuadradosCubos {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /**Imprime tabela com quadrados e cubos*/
    public static void inicio(){
//    public static void main(String[] args){
    /*Variável........................................................................................................*/
        int contador = 1;
    /*Inicio..........................................................................................................*/    
        System.out.println("Exercicio 31.............................................................................");
        System.out.printf("%8s\t%8s\t%8s\n","Numero","Quadrado","Cubo");
        System.out.printf("%8d\t%8d\t%8d\n",contador,contador*contador,contador*contador*contador);
        contador = contador + 1;
        System.out.printf("%8d\t%8d\t%8d\n",contador,contador*contador,contador*contador*contador);
        contador = contador + 1;
        System.out.printf("%8d\t%8d\t%8d\n",contador,contador*contador,contador*contador*contador);
        contador = contador + 1;
        System.out.printf("%8d\t%8d\t%8d\n",contador,contador*contador,contador*contador*contador);
        contador = contador + 1;
        System.out.printf("%8d\t%8d\t%8d\n",contador,contador*contador,contador*contador*contador);
        contador = contador + 1;
        System.out.printf("%8d\t%8d\t%8d\n",contador,contador*contador,contador*contador*contador);
        contador = contador + 1;
        System.out.printf("%8d\t%8d\t%8d\n",contador,contador*contador,contador*contador*contador);
        contador = contador + 1;
        System.out.printf("%8d\t%8d\t%8d\n",contador,contador*contador,contador*contador*contador);
        contador = contador + 1;
        System.out.printf("%8d\t%8d\t%8d\n",contador,contador*contador,contador*contador*contador);
        contador = contador + 1;
        System.out.printf("%8d\t%8d\t%8d\n",contador,contador*contador,contador*contador*contador);
    }
    
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
