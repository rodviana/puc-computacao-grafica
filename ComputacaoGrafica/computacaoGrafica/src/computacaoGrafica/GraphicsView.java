package computacaoGrafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsView extends JPanel  {
	
    TarefaProfessor tarefaProfessor;
   

    public GraphicsView(){

    }

    public void paintComponent(Graphics g){
    	
    	Graphics2D g2D = (Graphics2D) g;
    	
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        this.tarefaProfessor = new TarefaProfessor(new GraphicsService((Graphics2D) g));
        
        tarefaProfessor.tarefa7();
        
    }


}
