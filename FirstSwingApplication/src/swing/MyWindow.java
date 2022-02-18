package swing;

//import java.awt.Dimension;

import javax.swing.JFrame;

public class MyWindow extends JFrame {

	private static final long serialVersionUID = -4149672187121732910L;

	public MyWindow() {
		super("My first application from my life from the world from universe");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {
		MyWindow myWindow = new MyWindow();
		myWindow.setVisible(true);

	}

}
