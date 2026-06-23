package computacaoGrafica;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.util.List;

public class GraphicsService {
	
	Graphics2D g2D;
	
	GraphicsService(Graphics2D g2D)
	{
		this.g2D = g2D;
	}

    public void desenarLinha(Integer x1,Integer y1,Integer x2, Integer y2, Color cor, Integer stroke) 
    {
        // LINE
    	if(cor != null)
        this.g2D.setColor(cor);
    	if(stroke !=null)
        this.g2D.setStroke(new BasicStroke(stroke));
    	
        this.g2D.drawLine(x1,y1,x2,y2);
    }
    
    public void desenharPolyline() 
    {
        // POLYLINE
        int[] xPoints = {50,100,150,200,250,300,350};
        int[] yPoints = {350,200,250,200,150,200,50};
        int nPoints = xPoints.length;

        this.g2D.setColor(Color.GREEN);
        this.g2D.drawPolyline(xPoints, yPoints, nPoints);
    }
    
    public void desenharTexto() 
    {
        // TEXT
        this.g2D.setFont(new Font("Comic Sans",Font.ITALIC,25));
        this.g2D.setColor(Color.MAGENTA);
        this.g2D.drawString("STRING",150,100);
    }


    public void desenharPoligno(int[] xPoints, int[] yPoints,int points, Color cor, boolean isFilled) 
    {
    	if(cor!=null) 
    	{
    		this.g2D.setColor(cor);
    		if(isFilled)
    		this.g2D.fillPolygon(xPoints,yPoints,points);
    	}
    	else 
    		this.g2D.drawPolygon(xPoints,yPoints,points);
    		
    }


    public void desenharRetangulo(int x, int y, int width, int height, Color cor) 
    {
        // RECTANGLE
    	if(cor!=null)
    		this.g2D.setColor(Color.RED);
        this.g2D.drawRect(x, y, width, height);

    }
    
    public void desenharCirculo(int x, int y, int width, int height, Color color, Integer stroke, boolean fill) 
    {
        // OVAL
    	if(stroke !=null)
    		g2D.setStroke(new BasicStroke(stroke));
        if(color != null)
        	g2D.setColor(color);
        
        if(fill)
        	g2D.fillOval(x,y,width,height);
        else
        	g2D.drawOval(x, y, width, height);

    }
    public void desenharArco() 
    {
        // ARC
        this.g2D.setPaint(new Color(150,250,150));
        this.g2D.drawArc(40,40,320,320,-45,135);
    }
    public void desenharGradiente() 
    {
        // GRADIENT
        GradientPaint paint = new GradientPaint(0,0,Color.RED,210,0,Color.BLUE);
        this.g2D.setPaint(paint);
        this.g2D.fillArc(60,60,320,320,120,30);
    }
    public void circuloDeslocamento() 
    {
        int x3 = 21;
        int y3 = 21;
        // ANIMATED OBJECT
        this.g2D.setStroke(new BasicStroke(1));
        this.g2D.setColor(Color.WHITE);
        g2D.fillOval(x3,y3,20,20);
    }
    

    public void rotate(int graus,int x,int y) 
    {
    	g2D.rotate(Math.toRadians(graus),x,y);
    }
    
    public void scale(double sx, double sy) 
    {
    	g2D.scale(sx,sy);
    }
    
    public Double distanciaEntreDoisPontos(int x1,int y1, int x2, int y2) 
    {
    	return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public void espelharTrianguloEixoX(int[]x,int[]y, Color cor, boolean isFilled) 
    {
		int larguraTriangulo = new Double(this.distanciaEntreDoisPontos(x[0], y[0], x[2], x[2])).intValue();
		this.rotate(180, x[0], y[0]);
		this.desenharPoligno(new int[] {x[0]-larguraTriangulo, x[1]-larguraTriangulo, x[2]-larguraTriangulo},  y, 3,cor,isFilled);
    }
    
    public void desenharCubo(int x, int y, int size, int shift) 
    {
		Cube cube = new Cube(x, y, size, shift);
		cube.drawCube(this.g2D);
    }
}
