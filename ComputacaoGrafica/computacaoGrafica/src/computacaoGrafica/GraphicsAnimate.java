package computacaoGrafica;

public class GraphicsAnimate {
    int xPoint;
    int yPoint;
    int velocityX;
    int velocityY;
    
    
	public GraphicsAnimate(int x3, int y3, int velocityX, int velocityY) {
		super();
		this.xPoint = x3;
		this.yPoint = y3;
		this.velocityX = velocityX;
		this.velocityY = velocityY;
	}


    public int getxPoint() { return xPoint; }
	public void setxPoint(int xPoint) { this.xPoint = xPoint; }
	public int getyPoint() { return yPoint; }
	public void setyPoint(int yPoint) { this.yPoint = yPoint; }
	public int getVelocityX() { return velocityX; }
	public void setVelocityX(int velocityX) { this.velocityX = velocityX; }
	public int getVelocityY() { return velocityY; }
	public void setVelocityY(int velocityY) { this.velocityY = velocityY; }

	
	public void tarefa4Animate() 
    {
        // ANIMATION
        if(this.xPoint>=350 || this.xPoint<=20){
            velocityX = -velocityX;
        }
        if(this.yPoint>=350 || this.yPoint<=20){
            velocityY = -velocityY;
        }

        this.xPoint=this.xPoint+velocityX;
        this.yPoint=this.yPoint+velocityY;
    }
	
	
}
