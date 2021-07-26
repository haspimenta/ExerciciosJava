import java.util.*;
/**
 * Escreva um programa que pede o ano e as primeiras três letras do nome de um mês
 * e escreve a quantidade de dias desse mês. Note que a quantidade de dias do mês
 * de fevereiro está dependente do ano ser ou não bissexto.
 * @author (Hugo Alexandre Silva)
 * @version (V.1 - 11/11/2019)
 */
public class TP02_02{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }
    //função principal chamamento das ações, variaveis e metodos.
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String month = month("Digite as três primeiras letras do mês deseja pesquisar!");
        int year = year("Digite qual o ano deseja pesquisar!");
        int nYear = daysInMonth(year, month);
    }
    //função solicita que o utilizador informe ano retorna a mensagem na função principal.
    public static int year(String message){
        System.out.println(message);
        int year = scanner.nextInt();//solicita o ano para o utilizador
        return year;
    }
    //função solicita que o utilizador informe mes e retorna a mensagem na função principal.
    public static String month(String message){
        System.out.println(message);
        String month = scanner.nextLine();
        return month;
    }
    //função de calculo e regras para definição de ano bissexto e meses com seus respectivos dias.
    static int daysInMonth(int year, String month) {
        boolean bissexto = false; //inicia variavel boolean com valor false
        //condição para ano bissexto, sendo para valor maior que 400 ou para valores menores que 400.
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            bissexto = true;
            System.out.println("O ano " + year + " - é bissexto.");
        }else{
            System.out.println("O ano " + year + " - não é bissexto.");
        }
        //condição para verificar mês fevereiro, se o boolen ano bissexto for false informa os dia do mês.
        if(month.equals("fev")){
            if(bissexto == false){
                System.out.println("Os dias do mês " + month + " corresponde a 28!");
            }else{
                System.out.println("Os dias do mês " + month + " corresponde a 29!");
            }
            /** else if para continuar a analisar na mesma sequência caso a comparação tenha que ser com mês
             * diferente de fevereiro. Neste caso conforme calêndario já defini os meses e seus dias.
             */
        }else if(month.equals("jan") || month.equals("mar") || month.equals("mai") || month.equals("jul") || month.equals("ago") || month.equals("out") || month.equals("dez")) {
            System.out.println("Os dias do mês " + month + " corresponde a 31!");
        }else if(month.equals("abr") || month.equals("jun") || month.equals("set") || month.equals("nov")) {
            System.out.println("Os dias do mês " + month + " corresponde a 30!");
        }else{
            System.out.println("Mês digitado esta incorreto!");
        }
        return year;
    }
}
