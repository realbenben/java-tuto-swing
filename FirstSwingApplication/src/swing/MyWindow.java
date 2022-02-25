package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindow extends JFrame {

	private static final long serialVersionUID = -4149672187121732910L;

	public MyWindow() {
		super("My first application from my life from the world from universe");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		toujours faire le set size avt setlocation sinon sa decalle la fenetre 
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);

		JPanel contentPane = (JPanel) this.getContentPane();
//		en gros flowLayout rend le template flex
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		contentPane.add(new JButton("push me"));
		contentPane.add(new JButton("valider !!!!!!!!!!!!"));
		contentPane.add(new JRadioButton("oui ou non"));
		contentPane.add(new JCheckBox("Check me please !!!"));
		contentPane.add(new JTextField("edit me"));
		contentPane.add(new JOptionPane("choisis un truc bitch"));
		

	}

	public static void main(String[] args)throws Exception {
//		apply a look and fell
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		MyWindow myWindow = new MyWindow();
		myWindow.setVisible(true);

	}

}
