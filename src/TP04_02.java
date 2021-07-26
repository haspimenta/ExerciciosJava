import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.shape.*;
import javafx.embed.swing.*;
import javafx.application.*;
import javafx.scene.text.*;
import java.util.*;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;

/**
 * Hugo Alexandre Silva
 * Versão1 - 16/12/2019
 * Versão2 - 18/12/2019
 * Versão3 - 19/12/2019
 */
public class TP04_02 {
    public void launch(){
        // Initialises JavaFX:
        new JFXPanel();
        // Makes sure JavaFX doesn't exit when first window is closed:
        Platform.setImplicitExit(false);
        // Runs initialisation on the JavaFX thread:
        Platform.runLater(() -> start(new Stage()));
    }

    private void start(Stage primaryStage){
        primaryStage.setOnCloseRequest(
                e -> Platform.runLater( () -> {Platform.exit(); System.exit(0);} ) );
        Pane pane = new Pane(); //cria um novo painel
        pane.setPrefSize(600, 300); //define o tamanho do painel - região e dimensão
        primaryStage.setScene(new Scene(pane)); //especifica a cena a ser usada
        primaryStage.show(); //mostra a janela
        int nCircles = 9; //difine a quantidade de circulos
        Color colorRectColor = Color.YELLOW; //define a cor do retangulo
        Color colorTriangleColor = Color.GREEN; //define a cor do triangulo
        for (int i = 1; i <= 5; i++){ //ciclo para definir quantos pane gerais quer que imprima
            Pane drawPane = new Pane();//cria um novo painel
            drawPane.setLayoutX(i * 20); //para definir o layout em x, multiplicando o contador por 20
            drawPane.setLayoutY(i * 20); //para definir o layout em y, multiplicando o contador por 20           
            drawPane.setPrefSize(pane.getWidth(), pane.getHeight()); //define o tamanho do painel - região e dimensão
            //chama a função drawFigure e aplica a redução em width e height, assim como os parametros de cores e quantidade circulos
            drawFigure(drawPane, 0, 0, pane.getWidth() - (i * 30), pane.getHeight() - (i * 30), colorRectColor, colorTriangleColor, nCircles);
            pane.getChildren().add(drawPane);//obtem os filhos do painel e adiciona ao painel
        }
    }

    void drawFigure(Pane pane, double x, double y, double width, double height, Color rectColor, Color triangleColor, int nCircles){
        desenharFundo(pane, x, y, width, height, rectColor, triangleColor); //chama a função
        desenharCirculos(pane, x, y, width, height, nCircles);       //chama a função
    }

    private static void desenharCirculos(Pane pane, double x, double y, double width, double height, int nCircles){
        Pane circlePane = new Pane(); //cria novo painel 
        circlePane.setPrefSize(width, height);//define o tamanho do painel - região e dimensão
        double diametroMax = (width / nCircles); //define o tamanho do diametro
        double raio = diametroMax / 2; //defini a distancia do raio
        double posX = 0; //inicia a variavel x
        double posY = 0; //inicia variavel y
        for(int i = 0; i < nCircles; i++){ //contagem para criar s circulos
            boolean par = i % 2 == 0; // verificação para condição de valores pares
            posX = raio +(i *(raio * 2)); //define a posição X no raio
            if(par){
                posY = 0 + raio; //incia o posicionamento de y caso seja par em 0 do raio calculado
            }else{
                posY = raio * 3; // multiplica o raio por 3 para obter a distancia necessaria de um circulo para o outro a partir do centro
            }
            Circle circulo = new Circle(posX, posY, raio); //cria novo circulo conforme xy e raio
            final int RED = (int)(Math.random() * 256); //define uma sequancia aleatoria para a cor
            final int GREEN = (int)(Math.random() * 256);//define uma sequancia aleatoria para a cor
            final int BLUE = (int)(Math.random() * 256);//define uma sequancia aleatoria para a cor
            Color cor = Color.rgb(RED,GREEN,BLUE); //recebe o resultadoda variação rgb da cor
            circulo.setFill(cor); //especifica o preenchimento do circle
            circlePane.getChildren().add(circulo); //obtem os filhos do painel e adiciona ao circulo
        }
        pane.getChildren().add(circlePane);
        circlePane.setLayoutX((width / 2) - ((diametroMax * nCircles) / 2));//define o posicionamento de x
        circlePane.setLayoutY((height / 2) - ((diametroMax * 2) / 2)); //define o posicionamento de y
    }

    private static void desenharFundo(Pane pane, double x, double y, double width, double height, Color rectColor, Color triangleColor){
        Rectangle rect = new Rectangle(0, 0, width, height); //define o retangulo seu ponto de inicio e largura e altura
        rect.setFill(rectColor); //especifica o preenchimento do retangulo
        rect.setStrokeWidth(1); //especifica a linha de contorno, sua largura
        rect.setStroke(Color.BLUE); //define a cor da linha

        Polygon triangleA = new Polygon(); //cria um novo pane do poligno
        //define o triangulo seu ponto de inicio e largura e altura
        triangleA.getPoints().addAll(new Double[]{0.0, 0.0, width, height / 2, 0.0, height});
        triangleA.setFill(triangleColor);//especifica o preenchimento do retangulo

        Polygon triangleB = new Polygon();//cria um novo pane do poligno
        //define o triangulo seu ponto de inicio e largura e altura
        triangleB.getPoints().addAll(new Double[]{width, 0.0, 0.0, height / 2, width, height});
        triangleB.setFill(triangleColor);//especifica o preenchimento do retangulo

        pane.getChildren().addAll(rect, triangleA, triangleB);//obtem os filhos do painel e adiciona ao retangulo e triangulos
    }

    /** execute this method to start the program
     * executing the code in method start(Stage primaryStage) 
     */
    public static void start(){
        TP04_02 drawingApp = new TP04_02();
        drawingApp.launch();
    }

    public TP04_02(){
        super();
    }
} // END class TP04
