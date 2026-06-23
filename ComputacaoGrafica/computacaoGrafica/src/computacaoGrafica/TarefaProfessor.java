package computacaoGrafica;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Timer;

public class TarefaProfessor {

	GraphicsService graphicsService; 
	
	TarefaProfessor(GraphicsService graphicsService)
	{
		this.graphicsService = graphicsService;
	}

	public void tarefa1() 
	{
		/*
		 * T1:
		 * 
		 * a) Desenhar na tela uma reta, utilizando o OpenGL. Colorir e aumentar a
		 * espessura da reta.
		 * 
		 * 	 * b) Desenhar na tela uma reta, utilizando a equação linear da reta. Colorir e
		 * aumentar de espessura a reta.
		 * 
		 */
	
		 this.graphicsService.desenarLinha(200,200,400,400,Color.CYAN,10);
		
	}
	
	public void tarefa2() 
	{
		 /* 
		 * T2:
		 * 
		 * a) Desenhar um triângulo A, B e C; Rotacionar esse triângulo 45 graus em
		 * torno do vértice A.
		 */
		
		graphicsService.desenharPoligno(new int[] {200, 400, 500}, 
				   new int[] {500, 100, 500}, 3,Color.blue,true);
		
		
		graphicsService.rotate(45,200,500);
		graphicsService.desenharPoligno(new int[] {200, 400, 500}, 
									   new int[] {500, 100, 500}, 3,Color.red,true);
		
	}
	
	public void tarefa3() 
	{
		 /* 
		 * T3:
		 * 
		 * Dados os pontos A(2,2), B(4,2), C(2,4) e D(4,4), monte as seguintes equações
		 * de TG para:
		 * 
		 * a. Mover o centro do quadrado acima dado, para o ponto X(10,5);
		 * 
		 * b. Dobre o tamanho do quadrado dado acima;
		 * 
		 * c. Gire o quadrado acima em torno do ponto X 45˚ graus.
		 * 
		 * Obs:
		 * 
		 * Você deve, em todos os itens acima:
		 * 
		 * 1. Montar as equações de TG e TGC, quando for o caso;
		 * 
		 * 2. Montar as equações de TG e TGC, quando for o caso, utilizando os dados
		 * fornecidos;
		 * 
		 * 3. Fornecer os resultados numéricos intermediários e finais, de cada item.
		 */
		
		graphicsService.desenharPoligno(new int[] {20, 40, 40,20}, 
                new int[] {20, 20, 40,40}, 4,Color.red,true);
		
		graphicsService.rotate(45,20,40);
		graphicsService.desenharPoligno(new int[] {20, 40, 40,20},  new int[] {20, 20, 40,40}, 4,Color.green,true);
		
		
		graphicsService.rotate(-45,20,40);
		graphicsService.scale(2, 2);
		graphicsService.desenharPoligno(new int[] {20, 40, 40,20},  new int[] {20, 20, 40,40}, 4,Color.blue,true);
		
	}
	
	public void tarefa4(int xCircle,int yCircle) 
	{
		 /* T4:
		 * 
		 * a) Desenhar uma circunferência que se desloca sobre um segmento de reta AB.
		 */
		graphicsService.desenarLinha(0, 0, 400, 400, Color.white, 3 );
		graphicsService.desenharCirculo(xCircle,yCircle,20,20,Color.white,1,true);
		
	}
	
	public void tarefa6() 
	{
		//T6: a) Desenhar na tela uma um triângulo, utilizando o OpenGL. Colorir e mostrar a sua reflexão à origem.

		int x[]=new int[] {20, 40, 50};
		int y[]=new int[] {50, 10, 50};
		
		graphicsService.desenharPoligno(x, y, 3,Color.blue,true);
		graphicsService.espelharTrianguloEixoX(x, y,Color.red,true);
		
	}

	public void tarefa7() 
	{
		//T7:a) Desenhar um cubo em 3D, com um vértice na origem. Mostre o efeito de cisalhamento em relação à sua face, sobre o plano XZ. Use valores numérico de sua escolha.
		this.graphicsService.desenharCubo(75, 75, 200, 50);
		
	}
		
	

}
