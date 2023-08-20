import java.awt.*;
import java.awt.event.*;
class MouseDraggerLine extends Frame implements MouseMotionListener {
		int x,y ;
		
	
	public MouseDraggerLine(){
			Color clr1 = new Color(108,108,108);			setBackground(clr1);
			addMouseMotionListener(this);					setSize(900,700);
			setVisible(true);		
	}
	
	public void mouseMoved(MouseEvent e){
		Graphics g = getGraphics();
		x = e.getX();		y = e.getY();
		g.setColor(Color.red);
		g.drawLine(0,0,x,y);
		g.setColor(Color.green);
		g.drawLine(900,0,x,y);
		g.setColor(Color.yellow);
		g.drawLine(0,700,x,y);
		g.setColor(Color.orange);
		g.drawLine(900,700,x,y);		
	}
	
	public void paint(Graphics g){	
	}
	public void mouseDragged(MouseEvent e){
		
			
	}	
	
	public static void main(String args[]){
		MouseDraggerLine f =  new MouseDraggerLine();
	}
} 