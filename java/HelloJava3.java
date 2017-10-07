/* 
	I am Xue Chuangli(薛创立). You can contact me on web: oootwo.com.
	My phone number is (+86)131-2072-5819. And my email is xuechaungli666@163.com. 
	Donating through Wechat or Alipay from my phone number 13120725819.
*/
//file: HelloJava3.java
//It can print "Hello, Java!" in a window, and you can drag the text in the window.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava3
{
	public static void main(String[] args){
		JFrame frame = new JFrame("HelloJava3");
		frame.add(new HelloComponent3("Hello, Java!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}

class HelloComponent3 extends JComponent
	implements MouseMotionListener
{
	String theMessage;
	int messageX = 125, messageY = 95; //Coordinates of the message
	public HelloComponent3(String message){
		theMessage = message;
		addMouseMotionListener(this);
	}
	public void paintComponent(Graphics g){
		g.drawString(theMessage,messageX,messageY);
	}
	public void mouseDragged(MouseEvent e){
		// Save the mouse coordinates and paint the message.
		messageX=e.getX();

		messageY=e.getY();
		repaint();
	}

	public void mouseMoved(MouseEvent e) {}
}
