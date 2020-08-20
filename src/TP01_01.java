import java.util.*;
/**Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Escreva um programa que recebe um número inteiro positivo e escreve a metade
 * "triângulo" de números com a seguinte disposição,
 * exemplificada para o caso em que o número é 5.
 * @author (Hugo Alexandre Silva 18544)
 * @version (V.1 - 30/10/2019)
 */
public class TP01_01
{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }
    //quantidade desejada para criar as linhas com os numeros;
    public static void main(String[] args){
        int nLinhas = nLinhas("Digite a quantidade para contagem e formação da metade do triângulo: ");
        Quantidade(nLinhas); //chama a função do calculo para o triângulo ;
    }
    //impressão, entrada e armazenamento do valor desejado para contagem;
    public static int nLinhas(String message){
        System.out.print(message);
        int i = scanner.nextInt();
        return i;
    }
    //calculo do triângulo;
    public static void Quantidade(int nLinhas){
        for(int linhas = nLinhas; linhas >= 0; --linhas) { //contagem de linhas;
            System.out.println();//impressão para espaço entre linhas;
            for(int colunas = 1; colunas <= linhas; ++colunas) {//contagem de colunas;
                System.out.print(colunas + " ");//contagem para impressão colunas conforme numero digitado;
            }
            System.out.println();// impressão de quebra;
        }
    }
}