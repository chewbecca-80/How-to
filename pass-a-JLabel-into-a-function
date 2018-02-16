//Create a file to run your GUI.

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GitHubExample {
	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GitHubExample window = new GitHubExample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GitHubExample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		final JLabel lblNewLabel = new JLabel("Beginning text");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 5, 414, 80);
		panel.add(lblNewLabel);
		
		
		
		final ClassWithTheFunction fun = new ClassWithTheFunction("Changing labels is fun!!!");
		
		
		JButton btnNewButton = new JButton("Change Text");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(lblNewLabel.getText().equals("Beginning text")) {
        //pass the JLabel into the method
					fun.changeLabel(lblNewLabel);
				} else {
					lblNewLabel.setText("Beginning text");
				}
				
			}
		});
		btnNewButton.setBounds(129, 172, 177, 59);
		panel.add(btnNewButton);
	}
}
//************************************************************************************************************
//Create another file for the other class that will have the method that the JLabel is passed through
import javax.swing.JLabel;

public class ClassWithTheFunction {

	private String st;
	
	
	ClassWithTheFunction(String string) {
		this.st = string;
	}
	
  //Change label text in this method
	public void changeLabel(JLabel label) {
		label.setText(st);
		
	}
	
}


