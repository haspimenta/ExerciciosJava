import java.util.*;
/**Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * 
 * @author (Hugo Alexandre Silva - 18544)
 * @version 17/12/2019
 * @version 18/12/2019
 */
public class TP04_01{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }

    public static void main(String[] args){
        char[] toSwap = {'G', 'Z', 'H', 'J',  'K'};
        int[] positionsToSwap = {0, 2, 1, 1, 4, 1};
        System.out.println("Original: " + Arrays.toString(toSwap));  
        System.out.println("Posições a trocar: " + Arrays.toString(positionsToSwap));         
        System.out.println("Trocado: " + Arrays.toString(swaps(toSwap, positionsToSwap)));  
    }

    static char[] swaps(char[] toSwap, int[] positionsToSwap){
        char[] copyToSwap = copy(toSwap);
        int indexOrigem = 0;
        int indexDestino;
        char letraParaTrocar;
        char letraSubstituida;
        for(int index = 0; index < positionsToSwap.length; index++){      
            boolean isImpar = index % 2 != 0;
            if (isImpar){
                //guardar o char que esta na posição indicada pelo 
                letraParaTrocar = copyToSwap[indexOrigem];
                //obter index do destino 
                indexDestino = positionsToSwap[index];
                //memorizar que letra esta no index que vamos substituir
                letraSubstituida = copyToSwap[indexDestino];
                //colocar a letra no index destino
                copyToSwap[indexDestino] = letraParaTrocar;
                //colocar de volta a letra que estava no destino
                copyToSwap[indexOrigem] = letraSubstituida;
            }else{
                //memorizar o index para mover
                indexOrigem = positionsToSwap[index];
            }
        }
        return copyToSwap;
    }

    static char[] copy(char[] v){
        char[] copyOfV = new char[v.length];
        for(int i = 0; i < v.length; i++){
            copyOfV[i] = v[i];  
        }
        return copyOfV;
    }
}