package computacaoGrafica;

import javax.swing.*;

public class MyFrame extends JFrame {
    GraphicsView graphicsDemo = new GraphicsView();

    public MyFrame(){
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(graphicsDemo);
        this.setVisible(true);
    }
}
