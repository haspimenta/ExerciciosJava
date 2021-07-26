import java.util.Locale;
import java.util.Scanner;
/**
 * @author (Hugo Alexandre Silva)
 * @version (V.1)
 */
public class TP02_01 {
    //chama a entrada de new scanner e local no final do codigo "static"
    static final Scanner scanner;

    public TP02_01() {
    }

    public static void main(String[] args) {
        int nSides = nSides("Digite quantos lados possui o Poligono.");
        double leng = len("Digite o valor dos lados do Polígono.");
        areaRegPolygon(nSides, leng); //chama calculo da área do poligono
    }
    //recebe o numero de lados digitado pelo utilizador
    public static int nSides(String message) {
        System.out.print(message);
        int nSides = scanner.nextInt();
        return nSides;
    }
    //recebe o valor de comprimento dos lados
    public static double len(String message) {
        System.out.print(message);
        double len = scanner.nextDouble();
        return len;
    }
    //calculo da área do poligono
    public static double areaRegPolygon(int nSides, double len) {
        len = (double)nSides * len / 2.0; //calculo do comprimento dos lados
        double areaX = Math.sqrt(len * (len - (double)nSides)); //calculo da área
        if (areaX <= 0.0) { //condição para área com valor negativo ou zero
            System.out.println("Área não pode ser calculada, valor negativo ou zero de área!");
        } else {
            System.out.println("A área do polígono é! " + areaX);
        }
        return areaX;
    }
    static {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
    }
}
