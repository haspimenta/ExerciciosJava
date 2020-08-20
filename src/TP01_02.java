import java.util.Locale;
import java.util.Scanner;
/**Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Escreva um programa que recebe um número inteiro positivo para escrever a quantidade
 * de alunos de uma escola e para cada aluno uma nota. Ao final deve-se calcular e imprimir a média das
 * notas, imprimir a maior nota e o nome do aluno e imprimir a segunda maior nota e o nome do aluno.
 * @author (Hugo Alexandre Silva 18544)
 * @version (V.1 - 30/10/2019)
 */
public class TP01_02
    {
        final static Scanner scanner = new Scanner(System.in);
        static { scanner.useLocale(Locale.ENGLISH); }

    public static void main(String[] args) {
        int numeroAlunos = numeroAlunos("Digite a quantidade de alunos a ser lançada nota e nome: ");
        notaNomeAluno(numeroAlunos);//chama a função para nome e nota dos alunos
    }
    //imprime, recebe entrada de numero de alunos
    public static int numeroAlunos(String message) {
        System.out.print(message);
        int nAlunos = scanner.nextInt();
        return nAlunos;
    }
    //função recebe e armazena nome de alunos e notas
    public static void notaNomeAluno(int numeroAlunos) {
        String nomeMaior = "";
        double notaMaior = 0.0D;
        String nomeMaior2 = "";
        double notaMaior2 = 0.0D;

        for(int i = 0; i < numeroAlunos; ++i) { //enquanto contagem for n=menor que numero de alunos recebido faça
            System.out.print("Digite o nome do aluno: ");
            String nomeAlunos = scanner.next();
            int notaAlunos = numeroAlunos("Digite a nota do aluno: ");
            if ((double)notaAlunos >= notaMaior) { //verificação de nota maior e nome do aluno
                notaMaior2 = notaMaior;
                nomeMaior2 = nomeMaior;
                notaMaior = (double)notaAlunos;
                nomeMaior = nomeAlunos;
            }
            //segunda verificação de nota maior e nome do aluno
            if (notaMaior2 < (double)notaAlunos && notaMaior > (double)notaAlunos) {
                notaMaior2 = (double)notaAlunos;
                nomeMaior2 = nomeAlunos;
            }
        }
        //imprimi resultados
        System.out.println("O nome do aluno de maior nota é: " + nomeMaior);
        System.out.println("A maior nota é: " + notaMaior);
        System.out.println("O nome do aluno de segunda maior nota é: " + nomeMaior2);
        System.out.println("A segunda maior nota é: " + notaMaior2);
    }
}
