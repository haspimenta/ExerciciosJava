import java.util.*;
import java.util.Arrays;
/** Este template foi criado na 
 * Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * @author Hugo Alexandre Silva - 18544
 * @version V3-15/01/2020
 */

public class TP05_01 {

    public static void main(String[] args) {

        printlnV(inBoth(new int[] {1, 4, 3, 4},
                new int[] {2, 4, 5, 6, 4, 3, 3}));
        printlnV(inBoth(new int[] {1, 1},
                new int[] {2, 4, 3, 6, 4, 3, 3}));
        printlnV(inBoth(new int[] {2, 4, 5, 4, 4, 3, 3},
                new int[] {1, 4, 3, 4}));
        printlnV(inBoth(new int[] {1, 4, 3, 4},
                new int[] {2, 4, 3, 6, 4, 3, 3}));
        printlnV(inBoth(new int[] {1, 2, 4, 5, 7, 9},
                new int[] {2, 4, 3, 6, 7, 3, 8, 3}));
    }

    static int[] inBoth(int[] v1, int[] v2){ //complete -to do
        int tamanho = 0; //inicia variavel para contar o tamanho dos array
        int posicao = 0; //inicia variavel para contar as posições de valores iguais
        if (v1.length < v2.length) { //compara o comprimentos dos arrays -- buscamos o menor array
            tamanho = v1.length; //tamanho recebe resultado true da condição
        }else {
            tamanho = v2.length; //tamanho recebe resultado false da condição
        }

        int[] v3 = new int[tamanho]; //declaração do novo array, com valores do tamanho

        for(int i = 0; i <= tamanho - 1; i++) { //condição enquanto tamanho conter posição	
            if (v1[i] == v2[i]) { //compara igualdade dos arrays
                v3[posicao] = v1[i]; //sendo true - v3 recebe valor da posição
                posicao++; //incrementa posição
            }
        }
        // int[] vFinal = new int[posicao]; //declaração de novo array, com valores da posição
        // //esse array final tem o objetivo de tirar os zeros no array v3[tamanho]
        // for(int i = 0; i < posicao; i++) { //condição enquanto posição conter valor
        // vFinal[i] = v3[i]; //vFinal recebe valores do v3 posição
        // }
        return v3; //retorna array vFinal
    }

    static void printlnV(int[] v){
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

}