import java.util.*;
/**Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Escreva um programa que pede um número n ímpar entre 3 e 15 
 * e escreve asteriscos em formato de diamante, 
 * tal como exemplficado em seguida para alguns valores de n. 
 * Minimize a quantidade de instruções de escrita (print). 
 * Na verdade só precisa de um print para escrever cada diamante. 
 * Para tal deve construir todo o diamante de asteriscos numa String e 
 * só depois escrever essa String. Essa String deve ser criada pelo 
 * método static String drawDiamond(int n). 
 * Note que a maior parte das linhas têm espaços e asteriscos.
 * @author (Hugo Alexandre Silva - 18544)
 * @version (V.1 - 02/12/2019)
 */
public class TP03_01{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }
    //função principal chamamento das ações, variaveis e metodos.
    public static void main(String[] args) {
        int n = n("Digite um número ímpar entre 3 e 15.");
        String a = drawDiamond((int) n);
    }
    //função solicita que o utilizador informe valor e retorna a mensagem na função principal.
    public static int n(String message){
        System.out.println(message);
        int n = scanner.nextInt();//solicita o valor para o utilizador
        return n;
    }
    //função de calculo e desenho do diamante
    static String drawDiamond(int n){
        int asteriscos = 1; //inicia a variavel em 1 para imiprimir já um asteriscos, por isso não pode ser 0, pois não imprimiria nada;
        int espacos = (n-1)/2; //espaço vai ser contado até atingir 0, onde também vai corresponder que n é = asteriscos.
        if (n==3 || n==5 || n==7 || n==9 || n==11 || n==13 || n==15){ //compara o valor digitado se é igual a esses valores;
            for(int linha = 1 ; espacos > 0 ; linha++){ // faz o lançamento dos espaços por linha;
                for(int contador = 1 ; contador <= espacos ; contador++){ //conta os espaços a ser usado;
                    System.out.print(" ");
                }
                for(int contador = 1 ; contador <= asteriscos ; contador++){ //conta os asteriscos a ser usado
                    System.out.print("*");
                }
                espacos--; //diminui o espaço até atingir o valor de contador;
                asteriscos += 2; //aumenta o asteriscos a ser impresso até atingir n;
                System.out.println("");
            }

            for(int linha=1 ; asteriscos > 0 ; linha++){ // faz o lançamento dos asteriscos por linha;
                for(int contador = 1 ; contador <= espacos ; contador++){//conta os espaços a ser usado;
                    System.out.print(" ");
                }
                for(int contador = 1 ; contador <= asteriscos ; contador++){//conta os asteriscos a ser usado
                    System.out.print("*");
                }
                espacos++; //aumenta o espaço até atingir o valor de contador;
                asteriscos -= 2; //diminui o astericos a ser impresso até atingir 1;
                System.out.println("");
            }
        }else{
            System.out.println("Digite um valor ímpar entre 3 e 15.");
        }
        return null;
    }
}