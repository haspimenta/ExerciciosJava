import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.embed.swing.*;
import javafx.scene.paint.Color;
/** Este template foi criado na 
 * Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/10/05
 * -----------------------------------------------------
 * Esta classe cria um programa utilizando JavaFX que funciona dentro do BLueJ e
 * com um "Pane" para desenho de "Shapes"
 * Deve criar um objeto da classe GUI e depois chamar o método launch()
 * @author Hugo Alexandre Silva - 18544
 * @version V3-15/01/2020
 */
public class TP05_02 {
    public void launch(){
        // Initialises JavaFX:
        new JFXPanel();
        Platform.setImplicitExit(false);
        Platform.runLater(() -> start(new Stage()));

    }

    private void start(Stage primaryStage){
        primaryStage.setOnCloseRequest(
                e -> Platform.runLater( () -> {Platform.exit(); System.exit(0);} ) );

        // https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Pane.html
        Pane pane = new Pane(); //chama criação de novo painel
        pane.setPrefSize(900, 600); //largura e altura do painel
        primaryStage.setScene(new Scene(pane, Color.WHITE)); //definições e cor do painel
        primaryStage.show(); //chamamento do painel
        //variaveis size, x e y, define a posição de inicio dos triangulos do painel e tamanho 
        //de apresentação dentro do painel
        double size = 60;
        double x = size;
        double y = pane.getHeight() / 2;

        final int N_FIG = 5; //variavel para definir quantos group de triangulos serão mostrados

        for(int i = 1; i <= N_FIG; i++){ //faz a contagem do groupde triangulos
            Trigss triangulos = new Trigss(pane, x, y, size, i); //novos triangulos
            pane.getChildren().add(triangulos);//painel filho recebe triangulos
            x += size * 3; //definição da distancia entre os triangulos
        }
    }
}