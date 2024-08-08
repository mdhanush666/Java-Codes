
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

import javax.swing.*;


class Frame extends JFrame{
	
	Frame(){
		
		setSize(500,500);
		setTitle("My Frame");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;

// Line		
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(120, 100, 400, 400);
		
// Rectangle
		g2d.setStroke(new BasicStroke(1));
		g2d.setPaint(Color.blue);
		//g2d.drawRect(100, 200, 100, 50);
		g2d.fillRect(100,200,100,50);
		
// Circle
		g2d.setPaint(Color.red);
		g2d.setStroke(new BasicStroke(2));
		//g2d.drawOval(100, 300, 100, 100);
		g2d.fillOval(100, 300, 100, 100);
		
//  Arc
		g2d.setPaint(Color.red);
		//g2d.setStroke(new BasicStroke(2));
		//g2d.drawArc(300, 100, 100, 100, 0, 180);
		g2d.fillArc(300,100,100,100,0,180);
		
		g2d.setPaint(Color.blue);
		g2d.fillArc(300,100,100,100,180,180);
		
		
		
		
	}
	
}




public class ex1 {
	
	public static void main(String[] args) {
		
//		System.out.println("Hello World");
		new Frame();
		
	}

}
