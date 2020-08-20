import java.util.*;
/**Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Escreva um programa que pede ao utilizador o ano e o primeiro dia do ano 
 * (1 se for um domingo, 2 se for segunda-feira, etc).
 * Seguidamente o programa escreve qual o dia da semana do primeiro 
 * dia de cada mês.
 * @author (Hugo Alexandre Silva - 18544)
 * @version (V.1 - 01/12/2019)
 * @version (V.2 - 03/12/2019)
 * @version (V.3 - 04/12/2019)
 */
public class TP03_02{
    final static Scanner scanner = new Scanner(System.in);
    static {scanner.useLocale(Locale.ENGLISH);}

    //declaração de arrays para receber os meses do ano e outro para os dias da semana.
    private static final String[] diasSemana = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"}; //Week days
    private static final String[] mesesAno = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"}; //Month names   
    static int ano; //armazena o ano informado pelo utilizador;
    static int dDia; //armazena o dia incial informado pelo utilizador;
    //função principal chamamento das ações, variaveis ou metodos.
    public static void main(String[] args){
        stringMessage(); //ask the user to input values
        bCalc(); //calculate and print output
    }
    //função solicita que o utilizador informe ano retorna a mensagem na função principal.
    private static void stringMessage(){
        dDia = stringEntrada("Indique o primeiro dia do ano:");
        ano = stringEntrada("Indique o ano de consulta:");
        dDia--; //informação fornecida pelo utilizador que será verificada junto ao array de dias da semana. 
    }
    //função principal de calculo e contagem das posições dos arrays e seu comprimento
    private static void bCalc(){
        int mes; //declara a variavel mes;
        int dia; //declara a variavel dia;
        int contadorDia = 0; //declara e inicia a variavel contadorDia;
        int [] diasMes = diasMes(ano); //declara e recebe array dias mes

        for (mes = 0; mes < diasMes.length; mes++) { //comprimento do array meses
            if (mes == 0) { //inicia na posição 0, mes janeiro;
                contadorDia = dDia; //recebe dia informado para contagens;
            }
            System.out.println("Um de " + mesesAno[mes] + " do ano " + ano + " será " + diasSemana[contadorDia]);

            for (dia = 0; dia < diasMes[mes]; dia++){ //comprimento do array dias do mes; 
                contadorDia++; //contador receber acrescimo
                if (contadorDia == diasSemana.length){ //contador dia é igual a posição dia da semana, assim reinicia;
                    contadorDia = 0; // contador recebe 0;
                }
            }
        }
    }
    //função de chamamento do scanner para entrada de informação utilizador
    public static int stringEntrada(String question){
        System.out.println(question);
        return scanner.nextInt();
    }
    //função secundaria de contagem dos dias dentro do meses e se for bissexto checa com o if e calculo;
    private static int[] diasMes(int ano){
        int [] diasMes = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //checagem para ano bissexto, usando if
        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)){
            diasMes[1] = 29;
        }
        return diasMes;
    }
}