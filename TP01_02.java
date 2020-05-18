
import java.util.*;

/**Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Escreva um programa que pede a quantidade de alunos. 
 * Seguidamente pede o nome e a nota de cada aluno. 
 * No final o programa escreve o nome do aluno com a nota mais alta 
 * e do aluno com a segunda nota mas alta.
 * @author (Hugo Alexandre Silva 18544) 
 * @version (V.1 - 30/10/2019)
 */
public class TP02_01
{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }
    //função chama quantidade de alunos a ser lançado para registro de notas e nomes;
    public static void main(String[] args){
        int numeroAlunos = numeroAlunos("Digite a quantidade de alunos a ser lançada nota e nome: ");
        notaNomeAluno(numeroAlunos); //chama a função onde vamos registrar os dados dos alunos;
    }
    //função chama notas dos alunos a ser lançada;
    public static int numeroAlunos(String message){
        System.out.print(message);
        int nAlunos = scanner.nextInt();
        return nAlunos;
    }
    //função com os dados dos alunos, aqui será solicitado os nomes e notas;
    public static void notaNomeAluno(int numeroAlunos){
        //declaração das variaveis a serem usadas para a leitura de nome e nota;
        String nomeMaior = ""; //irá receber o nome do aluno de maior nota;
        double notaMaior = 0; //irá receber a nota do aluno de maior nota;
        String nomeMaior2 = ""; //irá receber o nome do aluno de segunda maior nota;
        double notaMaior2 = 0; //irá receber a nota do aluno de segunda maior nota;
        //for para efetuar a contagem do numero de alunos a ser digitado para lançamento de notas e nomes;
        for (int i = 0; i< numeroAlunos; i++){
            System.out.print("Digite o nome do aluno: ");
            String nomeAlunos = scanner.next();
            int notaAlunos = numeroAlunos ("Digite a nota do aluno: "); //chamamento da função da nota;
            //elabora condição para primeira regra de armazenamento de notas, para demonstrar nota maior;
            if(notaAlunos >= notaMaior){
                notaMaior2 = notaMaior;
                nomeMaior2 = nomeMaior;
                notaMaior = notaAlunos;
                nomeMaior = nomeAlunos;
            }
            //elabora condição para segunda regra de armazenamento de nota, para demonstrar segunda maior nota;
            if(notaMaior2 < notaAlunos && notaMaior > notaAlunos){
                notaMaior2 = notaAlunos;
                nomeMaior2 = nomeAlunos;
            }
        }
        //impressão de resultados;
        System.out.println("O nome do aluno de maior nota é: " + nomeMaior);
        System.out.println("A maior nota é: " + notaMaior);
        System.out.println("O nome do aluno de segunda maior nota é: " + nomeMaior2);
        System.out.println("A segunda maior nota é: " + notaMaior2);
    }
}