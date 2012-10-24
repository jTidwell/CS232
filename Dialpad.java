import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dialpad extends JFrame implements ActionListener {
	private JButton[] button;
	private JTextField field;
	
	public Dialpad() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 3));
		String[] labels = { "1", "2", "3", "4", "5", "6", 
							"7", "8", "9", "*", "0", "#"};
		button = new JButton[12];
		for(int i = 0; i < button.length; i++) {
			button[i] = new JButton(labels[i]);
			button[i].addActionListener(this);
			buttonPanel.add(button[i]);
		}
		setLayout(new BorderLayout());
		add(buttonPanel, BorderLayout.CENTER);
		field = new JTextField(15);
		//field.setEditable(false); // text-field cannot be edited
		add(field, BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent event) {	
		JButton b = (JButton)event.getSource();
		field.setText(field.getText() + b.getText());
	}
	
	public static void main(String[] args) {
		Dialpad window = new Dialpad();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
	}
}