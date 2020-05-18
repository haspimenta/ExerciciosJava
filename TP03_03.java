import java.util.*;
/**Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Escreva um programa que permite testar a seguinte função:
 * int[] positionsOfChar(String s, char c)
 * O array devolvido pela função deve conter as posições onde ocorre o char c. Por exemplo, para a chamada 
 * int[] v = positionsOfChar("adfaDSaJKLa", 'a')
 * o array v deve ficar com o seguinte conteúdo: {0, 3, 6, 10}
 * @author (Hugo Alexandre Silva - 18544)
 * @version (V.1 - 04/12/2019)
 */
public class TP03_03{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }
    //função principal chamamento das ações, variaveis e metodos.
    public static void main(String[] args){
        System.out.println("Digite uma frase!");
        String s = scanner.nextLine(); //recebe a string inserida pelo utilizador;
        System.out.println("Indique o caractere a ser buscado para localizar as posições.");
        char c = scanner.next().split("")[0].charAt(0); //recebe o caractere a ser localizado, informado pelo utilizador;
        int[] v = positionsOfChar(s,c); // efetua o chamamento da função para verificar a posoção do caractere;
        
        for(int i = 0; i < v.length; i++){ //efetua a contagem do comprimento do array;
            if(i == 0){
                System.out.print("{"+ v[i]);
            }
            else{
                System.out.print("," + v[i]);
            }
        }
        
        if(v.length != 0){
            System.out.print("}");
        }
    }
    //função para contagem da posição do caractere dentro do array para buscar a mesma posteriormente;
    private static int[] positionsOfChar(String s, char c){
        int[] v; // inicia array inteiro v;
        int arrayPosition = 0; //inicia a variavel;
        v = new int[arrayLength(s, c)];
        for(int i = 0; i < s.length(); i++){ // for para comprimento do array conforme caractere;
            if(s.charAt(i) == c){ //retorna o caractere da posição n da string;
                v[arrayPosition] = i; 
                arrayPosition++; 
            }
        }
        return v; 
    }
    //função para calcular a comprimento do array, conforme recebe a frase do utilizador armazena;
    private static int arrayLength (String s, char c){
        int n = 0;
        for(int i = 0; i < s.length(); i++){// for para comprimento do array conforme caractere;
            if(s.charAt(i) == c){ //retorna o caracter da posição n da string;
                n++;
            }
        }
        return n;
    }
}