
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// panel class 

class Panel extends JPanel implements ActionListener{
	
	Image bgImg,elementImg;
	
	final int width = 500;
	final int height = 500;
	
	int imgWidth = 100;
	int imgHeight = 100;
	
	Timer timer;
	
	int xVelocity = 20, yVelocity = 10;
	
	int x = 0, y = 0;
	
	Panel(){
		
		setPreferredSize(new Dimension(width,height));
		setBackground(Color.blue);
		
		elementImg = new ImageIcon("C:\\Users\\Dhanush\\Pictures\\ABC.png").getImage();
		bgImg = new ImageIcon("C:\\Users\\Dhanush\\Pictures\\7781047.jpg").getImage();
		
		timer = new Timer(100,this);
		timer.start();
		
		
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(bgImg,0,0,500,500,null);
		
		g2d.drawImage(elementImg,x,y,imgWidth,imgHeight,null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(x >= width - imgWidth || x < 0) {
			xVelocity = xVelocity * -1; 
		}
		
		if(y >= height - imgHeight || y < 0) {
			yVelocity = yVelocity * -1;
		}
		
		y = y + yVelocity;
		x = x + xVelocity;
		repaint();
		
	}
	
}

// Frame class 

class frame extends JFrame {

	frame(){
		
		Panel p1 = new Panel();
		
		add(p1);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("My Frame Animation");	
		
		
		
		setVisible(true);
		
	}
	
}

public class ex1 {
	
	public static void main(String[] args) {
		
		new frame();
		
	}

}
