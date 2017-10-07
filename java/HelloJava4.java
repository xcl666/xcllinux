/* 
	I am Xue Chuangli(薛创立). You can contact me on web: oootwo.com.
	My phone number is (+86)131-2072-5819. And my email is xuechaungli666@163.com. 
	Donating through Wechat or Alipay from my phone number 13120725819.
*/

//file: HelloJava3.java
// It print "Hello, Java!".You can drag the text. We add a JButton component to our application that changes the color of our text each time the button is pressed.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava4
{
	public static void main(String[] args){
		JFrame frame = new JFrame("Hello, Java!");
		frame.add(new HelloComponent4("Hello, Java!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}

class HelloComponent4 extends JComponent
	implements MouseMotionListener, ActionListener
{
	String theMessage;
	int messageX=125,messageY=95; // Coordinates of the message
	
	JButton theButton;
	
	int colorIndex; // Current index into someColors
	static Color[] someColors={
		Color.black, Color.red, Color.green, Color.blue, Color.magenta
	};

	public HelloComponent4(String message){
		theMessage = message;
		theButton = new JButton("Change Color");
		setLayout(new FlowLayout());
		add(theButton);
		theButton.addActionListener(this);
		addMouseMotionListener(this);
	}
	public void paitComponent(Graphics g){
		g.drawString(theMessage,messageX,messageY);
	}
	
	public void mouseDragged(MouseEvent e){
		messageX=e.getX();
		messageY=e.getY();
		repaint();
	}
	
	public void mouseMoved(MouseEvent e){}

	public void actionPerformed(ActionEvent e){
		// Did somebody push our button?
		if(e.getSource()==theButton)
			changeColor();
	}

	synchronized private void changeColor(){
		// Change the index to the next color, awkwardly.
		if(++colorIndex == someColors.length)
			colorIndex=0;
		setForeground(currentColr()); //Use the new color.
		repaint();
	}

	synchronized private Color currentColr(){
		return someColors[colorIndex];
	}
}
