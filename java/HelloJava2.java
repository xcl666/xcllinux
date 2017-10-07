/* 
	I am Xue Chuangli(薛创立). You can contact me on web: oootwo.com.
	My phone number is (+86)131-2072-5819. And my email is xuechaungli666@163.com. 
	Donating through Wechat or Alipay from my phone number 13120725819.
*/

import javax.swing.*;
import java.awt.*;

public class HelloJava2 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Hello, java!");
		JLabel label = new JLabel("Hello, java!",JLabel.CENTER);
		frame.add(new HelloComponent());
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
// Print "Hello, java!" with a window.

class HelloComponent extends JComponent {
	public void paintComponent(Graphics g) {
		g.drawString("Hello, Java!",125,95);
	}
}
// Print "Hello, java!" with a window and make the labe not in the center.
