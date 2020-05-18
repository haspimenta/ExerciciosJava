import java.util.*;
/**Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Escreva um programa que recebe a quantidade de lados de um 
 * polígono regular e o comprimento do lado. 
 * O programa pede esses dois valores ao utilizador e 
 * escreve o valor da área.
 * @author (Hugo Alexandre Silva - 18544) 
 * @version (V.1 - 11/11/2019)
 */
public class TP02_01{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }
    //função principal chamamento das ações, variaveis e metodos.
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int nSides = nSides("Digite quantos lados possui o triângulo.");
        double leng = len("Digite o valor dos lados do triângulo.");
        double a = areaRegPolygon(nSides, leng);

    }
    //função solicita que o utilizador informe valor e retorna a mensagem na função principal.
    public static int nSides(String message){
        System.out.print(message);
        int nSides = scanner.nextInt();//solicita o valor para o utilizador
        return nSides;
    }
    //função solicita que o utilizador informe valor de medida e retorna a mensagem na função principal
    public static double len(String message){
        System.out.print(message);
        double len = scanner.nextDouble();//solicita a medida ao utilizador
        return len;
    }
    //função de calculo de area com valores de medida e numero de lados
    public static double areaRegPolygon(int nSides, double len){
        len = (nSides * len) / 2.0; // recebe valores do triangulo x (soma) divide por 2;
        double areaX = Math.sqrt(len * (len - nSides)); // formula a área do triangulo;

        if(areaX <= 0){//condição para verificar se o valor de área for menor que zero ou não.
            System.out.println("Área não pode ser calculada, valor negativo ou zero de área!");
        }else{
            System.out.println("A área do triangulos é! " + areaX);
        }
        return areaX;
    }

}