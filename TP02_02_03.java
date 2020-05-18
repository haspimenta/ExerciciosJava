import java.util.*;
/**Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Ainda considerando o programa 2,
 * se o utilizador indicar o mês "all",
 * o programa irá escrever os dias de todos os meses do ano indicado.
 * @author (Hugo Alexandre Silva - 18544)
 * @version (V.1 - 11/11/2019)
 */
public class TP02_02_03{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }
    //função principal chamamento das ações, variaveis e metodos.
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String month = month("Digite as três primeiras letras do mês deseja pesquisar!");
        int year = year("Digite qual o ano deseja pesquisar!");
        int nYear;
        if (month.equals("all")){//condição para mês igual a all.
            String monthName = ""; //inicio da string monthName;
            for (int i = 1; i <= 12; i++){
                monthName = monthNumberToMonthName(i); //recebe as declarações feita na função monthNumberToMonthName 
                nYear = daysInMonth(year, monthName); //recebe as declaraçõs feita na função daysInMonth
                //System.out.println("O nome do mês " + i + " é " + monthName);
            }
        } else {
            nYear = daysInMonth(year, month);
        }
    }
    //função solicita que o utilizador informe ano retorna a mensagem na função principal.
    public static int year(String message){
        System.out.println(message);
        int year = scanner.nextInt();//solicita o ano para o utilizador.
        return year;
    }
    //função solicita que o utilizador informe mes e retorna a mensagem na função principal.
    public static String month(String message){
        System.out.println(message);
        String month = scanner.nextLine(); //solicita o mes para o utilizador.
        return month;
    }

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

    //Note que terá de utilizar um ciclo de 1 a 12
    //onde chama uma função com o nome
    //static String monthNumberToMonthName(int monthNumber)  
    //que para cada número do mês (1 a 12) devolve o nome.
    static String monthNumberToMonthName(int monthNumber){
        String month = ""; //inicia a variavel mês.
        switch (monthNumber) {                                                                  
            case 1: month = "jan"; //declaração de valores, correspondencia nome mes para numero
            return month; //retorna a declaração do mes
            case 2: month = "fev";
            return month;
            case 3: month = "mar";
            return month;
            case 4: month = "abr";
            return month;
            case 5: month = "mai";
            return month;
            case 6: month = "jun";
            return month;
            case 7: month = "jul";
            return month;
            case 8: month = "ago";
            return month;
            case 9: month = "set";
            return month;
            case 10: month = "out";
            return month;
            case 11: month = "nov";
            return month;
            case 12: month = "dez";
            return month;
        }  
        return month;
    }
}