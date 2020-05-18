import java.util.*;
/**Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Escreva um programa que utiliza uma função 
 * static String capitalizeName(String name) 
 * que recebe o nome completo de uma pessoa e 
 * devolve esse nome com a letra inicial de cada nome capitalizada. 
 * @author (Hugo Alexandre Silva - 18544) 
 * @version (V.1 - 11/11/2019)
 */
public class TP02_04
{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }
    //chamamento das funções de operação e ação para maiuscula 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String nNome = nNome("Digite o nome completo ou frase em minusculo!");
        String nNomes = capitalizeName(nNome);
    }
    //função para leitura dos caracteres digitados
    public static String nNome(String message){
        System.out.println(message);
        String nNome = scanner.nextLine();//solicita ao utilizador que digite nome ou frase.
        return nNome;
    }
    //corpo do operação com string e conversão para maiuscula
    static String capitalizeName(String nNome) {        
        String original = "" + nNome.charAt(0);//recebe a primeira letra da sentença, caracter 0.
        String posicao = original.toUpperCase();//recebe a letra, caracter, guardada e transforma para maiuscula
        String nOriginal = "";
        for(int i=1; i<nNome.length(); i++){  //for para contagem dos caracteres digitados
            nOriginal = nOriginal + nNome.charAt(i);//recebe os caracteres digitado apartir do 1, conformr for
            if( nNome.charAt(i) == ' '){  //condição para verificar existência de espaço
                String maiuscula = "" + nNome.charAt(i+1); //guarda o caracter após o espaço
                String nMaiuscula = maiuscula.toUpperCase(); //recebe o caracter após espaço guardado e transforma para maiusculo
                nOriginal = nOriginal + nMaiuscula; //adiciona o caracter maiuscula ao restante da palavra
                i = i + 1;  //conclui a contagem dos caracter com o 1 que foi substituido    
            } 
        } 
        System.out.println("Convertido: " + posicao + nOriginal); //imprime resultado na tela
        return nNome; 
    } 
}