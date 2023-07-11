import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JSwingComprogTestFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtFieldInput;

	final int maxRow = 4;
	final int maxCol = 4;
	private JButton btnBack;

	public JSwingComprogTestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MidTerm Practice");
		setBounds(100, 100, 450, 640);
		setFont(new Font("Elephant", Font.PLAIN, 17));
		setLocationRelativeTo(null);
		setVisible(true);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtFieldInput = new JTextField();
		txtFieldInput.setForeground(Color.BLUE);
		txtFieldInput.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFieldInput.setBounds(10, 11, 414, 105);
		contentPane.add(txtFieldInput);

		JPanel KeyPnl = new JPanel();
		KeyPnl.setBounds(10, 145, 414, 426);
		contentPane.add(KeyPnl);

		KeyPnl.setLayout(new GridLayout(maxRow, maxCol));

		btnBack = new JButton("<--");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnBack.setForeground(new Color(255, 255, 0));
		btnBack.setBackground(new Color(0, 0, 128));
		btnBack.setBorder(null);
		btnBack.setBounds(10, 567, 89, 23);
		btnBack.addActionListener(this);
		contentPane.add(btnBack);

		for (int i = 0; i < maxRow; i++) {
			for (int j = 0; j < maxCol; j++) {
				KeyPnl.add(new JButton("N: " + j));
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBack) {
			MainMenu mainMenu = new MainMenu();
			MainMenu.tabbedPane.setSelectedIndex(2);
			this.dispose();
		}
	}
}
