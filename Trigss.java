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
import javafx.scene.paint.Color;
import java.lang.Math;
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
public class Trigss extends Group { 

    public Trigss(Pane pane, double x, double y, double size, int n)
    {
        double altura = (Math.sqrt(3) / 2) * size; //formula para achar a altura, podiamos usar o T.pitagoras também
        if(n > 0){
            Polygon pol  = new Polygon(x - (size / 2), y, x + (size / 2), y, x, y - altura);//size que é comprimento em relação a x e y po 2 e altura.
            ConfTriangulo(pol); //definição dos triangulos, chama função - cor, preenchimento e largura linha                 
            Trigss c1 = new Trigss(pane, x, y - altura, size / 2, n - 1);
            //c1 triangulo posicionado na parte superior, altura, ponto central de x,y
            Trigss c2 = new Trigss(pane, x + (size - (size / 4)), y, size / 2, n - 1);
            //c2 triangulo a direito, posicionado no somatorio para o lado positivo
            Trigss c3 = new Trigss(pane, x - (size - (size / 4)), y, size / 2, n - 1);
            //c2 triangulo a esquerda, posicinado no diminuendo para o lado negativo do centro
            pane.getChildren().addAll(pol, c1, c2, c3);//painel filho recebe os triangulos
        }
    }

    private void ConfTriangulo(Polygon pol){
        pol.setStroke(Color.BLACK);//cor das linha dos triangulos
        pol.setStrokeWidth(1);//largura da linha
        pol.setFill(null);//preenchimento dos triangulos
    }
}
